    var CommentForm = React.createClass({
           handleSubmit: function(e){
               e.preventDefault();
               var author = this.refs.author.value.trim();
               var text = this.refs.text.value.trim();
               if(!text || !author){
                   return;
               }
               this.props.onCommentSubmit({username: author, message: text});
               this.refs.author.value = '';
               this.refs.text.value = '';
               return;
           },
           
           render: function() {
               return(
                  <form className="commentForm" onSubmit={this.handleSubmit}>
                  <input type="text" placeholder="Your name" ref="author"/>
                  <input type="text" placeholder="Write something" ref="text" />
                  <input type="submit" value="Post" />
                  </form>
                );
           }
       });