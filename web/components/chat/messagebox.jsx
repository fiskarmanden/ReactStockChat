
var MessageBox = React.createClass({

           loadCommentsFromServer: function(){
             $.ajax({
                url: this.props.loadUrl,
                dataType: 'json',
                cache: false,
                success: function(data){
                    this.setState({data: data});
                }.bind(this),
                error: function(xhr, status, err){
                    console.error(this.props.loadUrl, status, err.toString());
                }.bind(this)
             });
         },
         handleCommentSubmit: function(comment){

             var comments = this.state.data;
             var newComments = comments.concat([comment]);
             this.setState({data: newComments});

             var data = JSON.stringify(comment);
           $.ajax({
               url: this.props.postUrl,
               contentType: 'application/json; charset=utf-8',
               dataType: 'json',
               type: 'POST',
               data: data,
               success: function(){

               }.bind(this),
               error: function(xhr, status, err){
                   console.error(this.props.postUrl, status, err.toString());
               }.bind(this)
           });
         },
           getInitialState: function() {
             return {data: [], username: sessionStorage.username};
           },
          login: function(user){ 
            var input = user;
            if(input.trim() != ''){
            sessionStorage.username = input;
            this.setState({username: sessionStorage.username});
            }
            return;
      },

            logout: function(event){
            event.preventDefault();
            sessionStorage.username = '';
            this.setState({username: sessionStorage.username});
            return;
},
           
           componentDidMount: function(){
            this.loadCommentsFromServer();
            setInterval(this.loadCommentsFromServer, this.props.pollInterval);
           },
          render: function() {
              return(
              <div className="chat">
{this.state.username && (<Login logout={this.logout} logoutText="Logout" username={this.state.username}/>)}
                <div className="messageBox">
           
                <div className="chatHeader">
                {this.state.username && ( <h3>
                        Hello: {this.state.username} 
                </h3>) }
                
                {!this.state.username && (<Login login={this.login} submitText="Join Chat"/>)}
                </div>
                <MessageList data={this.state.data}/>
                <div className="chatBottom">
                { this.state.username && (
                <MessageForm onCommentSubmit={this.handleCommentSubmit} author={this.props.user} />
                )}

                
                </div>
                </div>
                </div>
             );
          }
       });
