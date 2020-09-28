import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http'
import {FormsModule} from '@angular/forms'

import { TemplateModule} from './template/template.module';
import { AppRoutingModule } from './app-routing.module';
import { ClientesModule } from './clientes/clientes.module';
import { ServicoPrestadoModule } from './servico-prestado/servico-prestado.module';

import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';

import {ClientesService} from './clientes.service'  
import { ServicoPrestadoService } from './servico-prestado.service';
import { LayoutComponent } from './layout/layout.component';



@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    LayoutComponent
    
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    TemplateModule,
    ClientesModule,
    HttpClientModule,
    ServicoPrestadoModule,
    FormsModule
  ],
  providers: [
    ClientesService,
    ServicoPrestadoService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
