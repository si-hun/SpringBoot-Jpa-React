import './App.css';
import Header from "./components/Header";
import {Route, Routes} from "react-router-dom";
import Home from "./pages/home/Home";
import Write from "./pages/board/Write";
import List from "./pages/board/List";
import View from "./pages/board/View";
import NotFound from "./pages/etc/NotFound";

function App() {

    //라우터 생성
    return (

            <div>
                <Header/>
                    <Routes>
                        <Route path="/" element={<Home/>}/>
                        <Route path="/board/write" element={<Write/>}/>
                        <Route path="/board/list" element={<List/>}/>
                        <Route path="/board/view/:id" element={<View/>}/>



                        <Route path="*" element={<NotFound />}></Route>
                    </Routes>
            </div>
    );

    /*
    const [message, setMessage] = useState([]);

    useEffect(() => {
        fetch("/api/hello")
            .then((response) => {
                return response.json();
            })
            .then(function (data) {
                setMessage(data);
            });
    }, []);

    return (
        <div className="App">
            <header className="App-header">
                <ul>
                    {message.map((text, index) => <li key={`${index}-${text}`}>{text}</li>)}
                </ul>
            </header>
        </div>
    );*/
}


export default App;
