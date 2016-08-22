" Note that this depends on instance variables being defined with explicit
" visibility modifiers and with either a ; or = on the same line
let g:instance_vars= "\\(private\\|public\\|protected\\) [a-zA-Z][a-zA-Z0-9_]* \\([a-z][a-zA-Z0-9_]*\\)\\s\\?\\(;\\|=\\)"
let g:_instance_vars="\\(private\\|public\\|protected\\) [a-zA-Z][a-zA-Z0-9_]* _\\([a-z][a-zA-Z0-9_]*\\)\\s\\?\\(;\\|=\\)"

function! Underscores()
    let @b=""
    exec ':%s/'.g:instance_vars.'/\=setreg("b", submatch(2))/ne'
    if @b!=""
        exec ':%s/'.@b.'/_'.@b.'/g'
        call Underscores()
    endif
endfunction

function! NoUnderscores()
    let @b=""
    exec ':%s/'.g:_instance_vars.'/\=setreg("b", submatch(2))/ne'
    if @b!=""
        exec ':%s/_'.@b.'/'.@b.'/g'
        call NoUnderscores()
    endif
endfunction

function! ToggleUnderscores()
    let @b=""
    exec ':%s/'.g:_instance_vars.'/\=setreg("b", submatch(2))/ne'
    if @b!=""
        " If it found an instance variable using a leading underscore,
        " assume all do and remove them
        call NoUnderscores()
    else
        " Otherwise, add leading underscores
        call Underscores()
    endif
endfunction
