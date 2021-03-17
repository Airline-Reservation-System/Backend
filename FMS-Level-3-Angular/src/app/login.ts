export class Login {
    userId:number;
    userName:string;
    userPassword:string;
    userType:string;
    constructor(id:number,username:string,password:string,typeofuser:string){
        this.userId=id;
        this.userName=username;
        this.userPassword=password;
        this.userType=typeofuser;
    }
}
