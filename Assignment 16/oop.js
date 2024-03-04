class college{
    collegeName="";
    constructor(collegeName){
        this.collegeName=collegeName;
    }
}


class student extends college{
    name="";
    roll="";
    per="";
    constructor(name,roll,per,collegeName)
    {
        super(collegeName);
        this.name=name;
        this.roll=roll;
        this.per=per;
        }
    print(){
        console.log("\nName : " + this.name + "\nRoll Number: "+this.roll+ "\nPercentage: "+this.per +"\nCollege: "+this.collegeName);
    }

}
    const s=new student("shridhar",2,67,"djfh");
    s.print()