import React from 'react';
import VideoForm from './VideosForm'
import VideosList from './VideosList'
import {connect} from "react-redux";

import {fetchVideoForCourse} from '../../actions/videosActions'
import {fetchTaskList} from '../../actions/taskActions'


import {VIEW_VIDEOS_LIST} from '../../actions/actionTypes'
import {fetchVideoList} from '../../actions/videosActions'
 

class Videos extends React.Component
{

    constructor(props)
    {
        super(props);
        this.state = {
            datosCurso:[],
            videosList:[]
        }
    }
    componentDidMount() {
        this.props.fetchVideoList();
    }

    componentWillReceiveProps(nextProps)
    {
        if (nextProps.actionType  === VIEW_VIDEOS_LIST) {
            this.setState({datosCurso: nextProps.videoList});
        }
    }

    render()
    {
        return(
            <div>
                <VideoForm/>
                <h1>{console.log("VIDEOSSSSSSSSSSSS:",this.state)}</h1>
                <VideosList courseList={this.props.videoList}/>
                <h1>{console.log(this.props)}</h1>
            </div>
        )
    }
}

const mapState = state =>{
    return{
        videoList: state.videosdata.todoList || [],
        actionType: state.videosdata.actionType
    }
};

const mapDispatch ={
    fetchVideoList
};

export default connect(mapState,mapDispatch)(Videos);