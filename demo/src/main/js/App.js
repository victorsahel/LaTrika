
// tag::vars[]
import React, { Component } from 'react';
import ReactDOM from 'react-dom';
// end::vars[]

// tag::app[]
class App extends Component {

    render() {
        return (
            <tr>
                <td>{this.props.employee.firstName}</td>
                <td>{this.props.employee.lastName}</td>
                <td>{this.props.employee.description}</td>
            </tr>
        )
    }
}

ReactDOM.render(
    <App />,
    document.getElementById('react')
);
