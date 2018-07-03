import {combineReducers} from 'redux';
import data from './task';
import coursesData from './coursesReducer'

import videosdata from './video'

export default combineReducers({
    data,coursesData,videosdata
});
