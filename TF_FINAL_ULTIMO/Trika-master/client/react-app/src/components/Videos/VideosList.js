import React,{ Component } from 'react';
import PropTypes from "prop-types";
import { className,Button, Glyphicon } from 'react-bootstrap'

const styles = {
    products: {
      display: 'flex',
      alignItems: 'stretch',
      flexWrap: 'wrap'
    },
    product: {
      width: '220px',
      marginLeft: 10,
      marginRight: 10
    },
    top:{
        marginLeft:4
    }
  };

class VideoList extends Component
{

    constructor(props) {
        super(props);
        this.state = {
            courseList:[]
        };
        this.renderList = this.renderList.bind(this);
    }

    static propTypes = {
        courseList: PropTypes.array.isRequired
    };

    componentWillReceiveProps(nextProps) {

        if (nextProps.courseList) {
            this.setState(this.state.courseList =  nextProps.courseList.slice())
        }
        {console.log("aslkdja")}
       
        {console.log(this.state.courseList)}
        
    }

    
    render()
    {

        return (
            
            <div style={styles.products} className="">
                {this.state.courseList.map(product =>
                <div className="thumbnail" style={styles.product} key={product.id}>
                    <img src={product.miniatura} alt={product.name} />
                    


                    <div className="caption">
                    <h4>{product.titulo}</h4>
                    <p>
                        <Button bsStyle="primary" onClick={() => this.addToCart(product)} role="button" disabled={product.inventory <= 0}>
                             
                            <Glyphicon glyph="trash" /> Eliminar
                        </Button>
                        <Button className="ml-4"  bsStyle="primary" onClick={() => this.addToCart(product)} role="button" disabled={product.inventory <= 0}>
                            
                            <Glyphicon glyph="pencil" /> Editar
                        </Button>
                    
                    </p>
                    </div>
                </div>
                )}
            </div>


        )
    }

    renderList() {
        return (
            <div>
                <h3>Current tasks: </h3>
                <ul>

                    {this.props.courseList.map((item, index) =>
                     (
                        <li key={index}>{item.titulo}</li>
                    )
                    )}
                </ul>
            </div>
        )
    }


    renderEmpty() {
        return (
            <div>No items found...</div>
        )
    }

}

export default VideoList;