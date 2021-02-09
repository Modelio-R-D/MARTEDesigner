/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_alloc.infrastructure.note;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Note} with << Assign_Note >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class AssignNote {
    public static final String STEREOTYPE_NAME = "Assign_Note";

    public static final String ASSIGN_NOTE_FROM_TAGTYPE = "Assign_Note_from";

    public static final String ASSIGN_NOTE_IMPLIEDCONSTRAINT_TAGTYPE = "Assign_Note_impliedConstraint";

    public static final String ASSIGN_NOTE_KIND_TAGTYPE = "Assign_Note_kind";

    public static final String ASSIGN_NOTE_NATURE_TAGTYPE = "Assign_Note_nature";

    public static final String ASSIGN_NOTE_TO_TAGTYPE = "Assign_Note_to";

    /**
     * The underlying {@link Note} represented by this proxy, never null.
     */
    protected final Note elt;

    /**
     * Tells whether a {@link AssignNote proxy} can be instantiated from a {@link MObject} checking it is a {@link Note} stereotyped << Assign_Note >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Note) && ((Note) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, AssignNote.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Note} stereotyped << Assign_Note >> then instantiate a {@link AssignNote} proxy.
     * 
     * @return a {@link AssignNote} proxy on the created {@link Note}.
     */
    public static AssignNote create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Note");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, AssignNote.STEREOTYPE_NAME);
        return AssignNote.instantiate((Note)e);
    }

    /**
     * Tries to instantiate a {@link AssignNote} proxy from a {@link Note} stereotyped << Assign_Note >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Note
     * @return a {@link AssignNote} proxy or <i>null</i>.
     */
    public static AssignNote instantiate(final Note obj) {
        return AssignNote.canInstantiate(obj) ? new AssignNote(obj) : null;
    }

    /**
     * Tries to instantiate a {@link AssignNote} proxy from a {@link Note} stereotyped << Assign_Note >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Note}
     * @return a {@link AssignNote} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static AssignNote safeInstantiate(final Note obj) throws IllegalArgumentException {
        if (AssignNote.canInstantiate(obj))
        	return new AssignNote(obj);
        else
        	throw new IllegalArgumentException("AssignNote: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        AssignNote other = (AssignNote) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for List<String> property 'Assign_Note_from'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getAssign_Note_from() {
        return this.elt.getTagValues(AssignNote.MdaTypes.ASSIGN_NOTE_FROM_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Assign_Note_impliedConstraint'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getAssign_Note_impliedConstraint() {
        return this.elt.getTagValues(AssignNote.MdaTypes.ASSIGN_NOTE_IMPLIEDCONSTRAINT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Assign_Note_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getAssign_Note_kind() {
        return this.elt.getTagValue(AssignNote.MdaTypes.ASSIGN_NOTE_KIND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Assign_Note_nature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getAssign_Note_nature() {
        return this.elt.getTagValue(AssignNote.MdaTypes.ASSIGN_NOTE_NATURE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Assign_Note_to'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getAssign_Note_to() {
        return this.elt.getTagValues(AssignNote.MdaTypes.ASSIGN_NOTE_TO_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Note}. 
     * @return the Note represented by this proxy, never null.
     */
    public Note getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'Assign_Note_from'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setAssign_Note_from(final List<String> values) {
        this.elt.putTagValues(AssignNote.MdaTypes.ASSIGN_NOTE_FROM_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'Assign_Note_impliedConstraint'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setAssign_Note_impliedConstraint(final List<String> values) {
        this.elt.putTagValues(AssignNote.MdaTypes.ASSIGN_NOTE_IMPLIEDCONSTRAINT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Assign_Note_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setAssign_Note_kind(final String value) {
        this.elt.putTagValue(AssignNote.MdaTypes.ASSIGN_NOTE_KIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Assign_Note_nature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setAssign_Note_nature(final String value) {
        this.elt.putTagValue(AssignNote.MdaTypes.ASSIGN_NOTE_NATURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'Assign_Note_to'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setAssign_Note_to(final List<String> values) {
        this.elt.putTagValues(AssignNote.MdaTypes.ASSIGN_NOTE_TO_TAGTYPE_ELT, values);
    }

    protected AssignNote(final Note elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType ASSIGN_NOTE_KIND_TAGTYPE_ELT;

        public static TagType ASSIGN_NOTE_NATURE_TAGTYPE_ELT;

        public static TagType ASSIGN_NOTE_FROM_TAGTYPE_ELT;

        public static TagType ASSIGN_NOTE_TO_TAGTYPE_ELT;

        public static TagType ASSIGN_NOTE_IMPLIEDCONSTRAINT_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ae295656-11a1-11df-b398-0014222a9f79");
            ASSIGN_NOTE_KIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5b662511-11a2-11df-b398-0014222a9f79");
            ASSIGN_NOTE_NATURE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "617d6c19-11a2-11df-b398-0014222a9f79");
            ASSIGN_NOTE_FROM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "686da9d5-11a2-11df-b398-0014222a9f79");
            ASSIGN_NOTE_TO_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "6c039631-11a2-11df-b398-0014222a9f79");
            ASSIGN_NOTE_IMPLIEDCONSTRAINT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "6eb70269-11a2-11df-b398-0014222a9f79");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(MARTEModule.getInstance() != null) {
			init(MARTEModule.getInstance().getModuleContext());
		}
	}
    }

}
