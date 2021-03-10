import SwiftUI
import shared

func greet() -> String {
    return Greeting().greeting()
}

func bye() -> String {
    return Greeting().bye()
}

struct ContentView: View {
    var body: some View {
        Text(greet())
        Text(bye())
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
