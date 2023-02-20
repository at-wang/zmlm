import HelloWorld from '../components/HelloWorld.vue'
import test from "../components/test.vue";
import UserRecord from "../pages/userpage/UserRecord.vue";

const routes = [

    {
        name: '',
        path: '/',
        component: test
    },
    {
        name: '',
        path: '/userRecord',
        component: UserRecord
    },

];

export default routes
