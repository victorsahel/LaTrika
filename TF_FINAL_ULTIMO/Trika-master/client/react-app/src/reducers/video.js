import {VIEW_VIDEOS_LIST} from "../actions/actionTypes";

export default function videosdata(state = {}, action) {
    switch (action.type) 
    {
        case VIEW_VIDEOS_LIST:
            return Object.assign({}, state, {
                actionType: action.type,
                todoList: action.videoList,
                error: false
            });

        default:
            return state;
    }
}
