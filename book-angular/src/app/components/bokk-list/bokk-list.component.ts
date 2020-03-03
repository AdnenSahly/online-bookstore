import { Component, OnInit } from '@angular/core';
import { Book } from 'src/app/common/book';
import { BookService } from 'src/app/services/book.service';

@Component({
  selector: 'app-bokk-list',
  templateUrl: './bokk-list.component.html',
  styleUrls: ['./bokk-list.component.css']
})
export class BokkListComponent implements OnInit {
books: Book [] ;

constructor(private bookService: BookService) { }

  ngOnInit() {
    this.listBooks();
  }

listBooks() {
  this.bookService.getBooks().subscribe(
    data => {
      this.books= data;
      console.log(data);
    }
  )
}

}
