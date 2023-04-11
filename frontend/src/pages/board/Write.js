import React, {useEffect, useState} from 'react';
import {Button, Form} from "react-bootstrap";
import axios from "axios";
import {useNavigate} from "react-router-dom"


const Write = () => {

    const navigate  = useNavigate();

    const [title,setTitle] = useState();
    const [contents,setContents] = useState();
    const [writer,setWriter] = useState();

    const submitBtn = () => {

        let data = {
            title: title,
            contents: contents,
            writer: writer
        }

        axios.post("/api/board/write", JSON.stringify(data), {
            headers: {
                "Content-Type": 'application/json',
            },
        })
        .then((res) => {
            if (res !== null) {
                alert("성공");
                navigate("/board/list");
            } else {
                alert("에러");
            }
        })
    }

    return (
        <div>
            <div>
                <input type="text" name='title' value={title} onChange={(e)=>setTitle(e.target.value)}/>
            </div>
            <div>
                <input type="text" name='title' value={writer} onChange={(e)=>setWriter(e.target.value)}/>
            </div>
            <div>
                <textarea name='content' value={contents} onChange={(e)=>setContents(e.target.value)}/>
            </div>
            <button onClick={submitBtn}>글 작성</button>
        </div>
    );
};

export default Write;