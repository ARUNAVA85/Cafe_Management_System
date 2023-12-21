import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { UserStorageService } from './services/storage/user-storage.service';
import { FormGroup } from '@angular/forms';
import { NzButtonSize } from 'ng-zorro-antd/button';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  
  title = 'Cafe Vista';

  isCustomerLoggedIn : boolean = UserStorageService.isCustomerLoggedIn();
  isAdminLoggedIn : boolean = UserStorageService.isAdminLoggedIn();
  // isSpinning: boolean;
  // categories: any[];
  // adminService: any;
  // validateForm!: FormGroup;
  // size: NzButtonSize = 'large';

  constructor(private router: Router) { }

  ngOnInit(): void {
    this.router.events.subscribe(event => {
      if (event.constructor.name === "NavigationEnd") {
        this.isCustomerLoggedIn = UserStorageService.isCustomerLoggedIn();
        this.isAdminLoggedIn  = UserStorageService.isAdminLoggedIn();
      }
    })
  }

  logout(){
    UserStorageService.signOut();
    this.router.navigateByUrl('login');
  }

  // submitForm() {
  //   this.isSpinning = true;
  //   this.categories = [];
  //   this.adminService.searchCategoryByTitle(this.validateForm.get(['title'])!.value).subscribe((res) => {
  //     res.forEach(element => {
  //       element.processedImg = 'data:image/jpeg;base64,' + element.returnedImg;
  //       this.categories.push(element);
  //       this.isSpinning = false;
  //     });
  //   });
  // }

}


