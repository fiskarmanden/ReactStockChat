var TopStocks = React.createClass({
    getStocks: function() {
        if (this.state.stockSet.size > 0) {
            var url = this.props.url;
            this.state.stockSet.forEach(
                function(value) {
                    url = url + value + ',';
                }
            );

              $.ajax({
                url: url,
                dataType: 'json',
                cache: false,
                success: function(data) {
                    this.setState({
                      stocks: data.resources,
                    });

                    if (this.state.stockSet.size !== this.state.stocks.length) {

                        var arraySet = new Set(this.state.stocks.map(function(stock) {
                            return stock.symbol.toUpperCase();
                        }));

                        var stockSet = this.state.stockSet;

                        stockSet.forEach(function(value) {
                            if (!arraySet.has(value)) {
                                stockSet.delete(value);
                            }
                        });

                        localStorage.setItem('stockSet', JSON.stringify(Array.from(this.state.stockSet)));
                    }
                }.bind(this),
                error: function(xhr, status, err) {
                  console.error(this.props.url, status, err.toString());
                }.bind(this)
              });
        }
    },

    componentDidMount: function() {
        setInterval(this.getStocks, this.props.pollInterval);
        this.getStocks();
    },

    getInitialState: function() {
        var localStocks = JSON.parse(localStorage.getItem('stockSet'));
        return {stocks: [], stockSet: new Set(localStocks)};
    },  

    addStock: function(e) {
        e.preventDefault();

        var textField = React.findDOMNode(this.refs.stockInput);
        var symbol = textField.value.trim().toUpperCase();
        textField.value = '';

        this.state.stockSet.add(symbol);
        localStorage.setItem('stockSet', JSON.stringify(Array.from(this.state.stockSet)));

        this.getStocks();
    },

    render: function() {

        var stockNodes = this.state.stocks.map(function (stock, index) {
            return (
                <tr className={(stock.chg_percent > 0 ? "success" : (stock.chg_percent < 0 ? "danger" : "warning")) }>
                    <td>{stock.name}</td> 
                    <td>{stock.chg_percent}%</td>
                </tr>
            );
          });

        return (
            <div className="panel panel-info pull-left stockPanel">
                <div className="panel-heading">
                    <h3 className="panel-title">
                        <b>My favorite stocks</b>
                    </h3>
                </div>
                
                    <form onSubmit={this.addStock}>
                            <div className="input-group">
                              <input type="text" ref="stockInput" className="form-control" placeholder="Enter stock symbol..." />
                              <span className="input-group-btn">
                                <button type="button" className="btn btn-primary">Add</button>
                              </span>
                            </div>
                    </form>
                <table className="table">
                    <thead>
                        <tr>
                            <th>Name</th>
                            <th>Change in %</th>
                        </tr>
                    </thead>
                    <tbody>
                        {stockNodes}
                    </tbody>
                </table>
            </div>
        );
    }
});