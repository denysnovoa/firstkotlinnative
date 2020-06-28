//
//  ContentView.swift
//  firstkotlinnativeios
//
//  Created by Denys Ricardo Novoa López on 28/06/2020.
//  Copyright © 2020 Denys. All rights reserved.
//

import SwiftUI
import shared

struct ContentView: View {
    var body: some View {
        Text(Greeting().greeting())
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
