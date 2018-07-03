import {VIEW_VIDEOS_LIST} from './actionTypes'




export function fetchVideoList()
{
    const url = "http://localhost:8080/api/videos";
    return function (dispatch, getState) {

        fetch(url)
            .then(response => response.json())
            .then(jsonData => {
                dispatch(setVideoList(jsonData._embedded.videos))
            })
    };
}

function setVideoList(videoList)
{
    return{
        type: VIEW_VIDEOS_LIST,
        videoList
    }
}

