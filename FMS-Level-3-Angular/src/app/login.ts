export class Login {
    id:number;
    username:string;
    password:string;
    typeofuser:string;
    constructor(id:number,username:string,password:string,typeofuser:string){
        this.id=id;
        this.username=username;
        this.password=password;
        this.typeofuser=typeofuser;
    }
}
