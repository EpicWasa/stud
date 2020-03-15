import {NoteList} from  './ListClass.js';
import {Note} from "./ListClass.js";


let table = document.querySelector('#example');
let addNote = document.querySelector('#add-note');
let studied = document.querySelector('#studied');
let addition = document.querySelector('#addition');
let date = document.querySelector('#date');
addNote.onclick = function(event){
    event.preventDefault();
    console.log('works');

    NoteList.list.push(new Note(studied.value, date.value, addition.value));
    generateTable(table);
}



function generateTable(table) {
    var t = " <tr>\n" +
        "        <th>Studied</th>\n" +
        "        <th>Add Date</th>\n" +
        "        <th>DeadLine</th>\n" +
        "        <th>Additional</th>\n" +
        "    </tr>";

    for (var i = 0; i < NoteList.list.length; i++){
        var tr = "<tr>";
        tr += "<td>"+NoteList.list[i].studied+"</td>";
        tr += "<td>"+NoteList.list[i].fromDate+"</td>";
        tr += "<td>"+NoteList.list[i].toDate+"</td>";
        tr += "<td>"+NoteList.list[i].additionalInfo+"</td>";
        tr += "</tr>";
        t += tr;
    }
    table.innerHTML  =t;
}