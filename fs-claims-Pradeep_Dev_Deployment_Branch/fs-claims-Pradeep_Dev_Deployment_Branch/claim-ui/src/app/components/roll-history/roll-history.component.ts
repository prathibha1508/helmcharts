import { Component,Input } from '@angular/core';
import { BodyClassService } from 'src/app/ngrx/store/services/body-class.service';
interface SideNavToggle {
  screenWidth: number;
  collapsed: boolean;
}


@Component({
  selector: 'app-roll-history',
  templateUrl: './roll-history.component.html',
  styleUrls: ['./roll-history.component.scss']
})
export class RollHistoryComponent {
  constructor(
    private bodyClassService: BodyClassService){}
    @Input() screenWidth = 0;
    public isSideNavCollapsed: boolean = true;
    public getBodyClass(): string {
      return this.bodyClassService.getBodyClass(this.isSideNavCollapsed, this.screenWidth);
    }

    public onToggleSideNav(data: SideNavToggle): void {
      this.screenWidth = data.screenWidth;
      this.isSideNavCollapsed = data.collapsed;
    }
}
