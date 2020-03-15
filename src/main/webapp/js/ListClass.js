export class NoteList{

    static list = [];

}

export class Note {

    constructor(studied, toDate, additionalInfo){
        this.studied=studied;
        this.toDate = toDate;
        this.additionalInfo=additionalInfo;

        this.fromDate = Date();

    }

    studied;
    fromDate;
    toDate;
    additionalInfo;

}