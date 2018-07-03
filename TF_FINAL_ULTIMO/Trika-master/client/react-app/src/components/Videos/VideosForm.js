import React from 'react';
import {Form, FormGroup, FormControl, ControlLabel, Button} from 'react-bootstrap';

class VideosForm extends React.Component{

    render(){
        return(
            <div>
                <h3> Videos :</h3>
                <Form>
                    <FormGroup>
                        <ControlLabel>Nombre de Video</ControlLabel>
                        <FormControl placeholder="video name"/>
                    </FormGroup>
                    <Button type="submit">Agregar Video</Button>
                </Form>
            </div>
        )
    }

}


export default VideosForm;