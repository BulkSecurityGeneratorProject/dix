import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import {SearchAssociationsComponent} from './search-associations/search-associations.component';
import { CreateAssociationComponent } from './create-association/create-association.component';

const ENTITY_STATES = [
];

@NgModule({
    imports: [
        FormsModule,
    ],
    declarations: [
        SearchAssociationsComponent,
        CreateAssociationComponent,
    ],
    entryComponents: [
        SearchAssociationsComponent,
        CreateAssociationComponent
    ],
    providers: [
    ],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class FeaturesModule {}