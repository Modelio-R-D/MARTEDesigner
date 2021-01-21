/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_alloc.infrastructure.note;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
@objid ("2516e831-893d-4417-9893-6722e0f017c3")
public class AssignNote {
    @objid ("3131b265-897d-4f31-86b9-4f25637baba4")
    public static final String STEREOTYPE_NAME = "Assign_Note";

    @objid ("b4524408-be4b-4803-a183-6d7859a48692")
    public static final String ASSIGN_NOTE_FROM_TAGTYPE = "Assign_Note_from";

    @objid ("0ccb8384-6863-480a-a864-45f087407ba8")
    public static final String ASSIGN_NOTE_IMPLIEDCONSTRAINT_TAGTYPE = "Assign_Note_impliedConstraint";

    @objid ("f7366b76-c8e2-4121-8c9e-575bb67565a9")
    public static final String ASSIGN_NOTE_KIND_TAGTYPE = "Assign_Note_kind";

    @objid ("a6f0f044-df0e-43a2-9221-eaf2deeb2a9f")
    public static final String ASSIGN_NOTE_NATURE_TAGTYPE = "Assign_Note_nature";

    @objid ("9d12c7ed-6690-4473-b682-3ddf38b1897f")
    public static final String ASSIGN_NOTE_TO_TAGTYPE = "Assign_Note_to";

    /**
     * The underlying {@link Note} represented by this proxy, never null.
     */
    @objid ("79e2110d-7ef0-4de6-a656-3578df2a835e")
    protected final Note elt;

    /**
     * Tells whether a {@link AssignNote proxy} can be instantiated from a {@link MObject} checking it is a {@link Note} stereotyped << Assign_Note >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("b0401d4a-28d2-4711-ab6d-123ff9e483c7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Note) && ((Note) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, AssignNote.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Note} stereotyped << Assign_Note >> then instantiate a {@link AssignNote} proxy.
     * 
     * @return a {@link AssignNote} proxy on the created {@link Note}.
     */
    @objid ("b97e44e4-23cc-4a96-a2fb-f4cae58195a7")
    public static AssignNote create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Note");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, AssignNote.STEREOTYPE_NAME);
        return AssignNote.instantiate((Note)e);
    }

    /**
     * Tries to instantiate a {@link AssignNote} proxy from a {@link Note} stereotyped << Assign_Note >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Note
     * @return a {@link AssignNote} proxy or <i>null</i>.
     */
    @objid ("cc031a47-4b69-4ba5-b7ab-74e456b8b61b")
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
    @objid ("ddd9aefd-c541-4055-b326-a64bf6ef371a")
    public static AssignNote safeInstantiate(final Note obj) throws IllegalArgumentException {
        if (AssignNote.canInstantiate(obj))
        	return new AssignNote(obj);
        else
        	throw new IllegalArgumentException("AssignNote: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("76e688a1-0bec-4330-a5f2-64ab1d906347")
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
    @objid ("9fe7512b-e456-4157-b303-025ef5b8eac0")
    public List<String> getAssign_Note_from() {
        return this.elt.getTagValues(AssignNote.MdaTypes.ASSIGN_NOTE_FROM_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Assign_Note_impliedConstraint'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("14f33b7e-5074-4956-b310-283112ba6cdb")
    public List<String> getAssign_Note_impliedConstraint() {
        return this.elt.getTagValues(AssignNote.MdaTypes.ASSIGN_NOTE_IMPLIEDCONSTRAINT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Assign_Note_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d6fcd619-f1f7-4b1d-b369-ad830f64928f")
    public String getAssign_Note_kind() {
        return this.elt.getTagValue(AssignNote.MdaTypes.ASSIGN_NOTE_KIND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Assign_Note_nature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("438e476e-4cca-433c-88b4-a405dd45611d")
    public String getAssign_Note_nature() {
        return this.elt.getTagValue(AssignNote.MdaTypes.ASSIGN_NOTE_NATURE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'Assign_Note_to'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("360b6115-cc49-490c-aa30-6db2b140346f")
    public List<String> getAssign_Note_to() {
        return this.elt.getTagValues(AssignNote.MdaTypes.ASSIGN_NOTE_TO_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Note}. 
     * @return the Note represented by this proxy, never null.
     */
    @objid ("f78ed841-4db2-485c-b018-111ff73809d6")
    public Note getElement() {
        return this.elt;
    }

    @objid ("d1b861c3-d606-4c61-a251-72764c8be450")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'Assign_Note_from'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("01f6ebf4-ca64-4d3e-8a97-01c5d578c8b4")
    public void setAssign_Note_from(final List<String> values) {
        this.elt.putTagValues(AssignNote.MdaTypes.ASSIGN_NOTE_FROM_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'Assign_Note_impliedConstraint'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("60d65c15-a478-4339-93f8-28be81dc9b7c")
    public void setAssign_Note_impliedConstraint(final List<String> values) {
        this.elt.putTagValues(AssignNote.MdaTypes.ASSIGN_NOTE_IMPLIEDCONSTRAINT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'Assign_Note_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c36c47cc-4674-435f-a8fa-a67015a667f9")
    public void setAssign_Note_kind(final String value) {
        this.elt.putTagValue(AssignNote.MdaTypes.ASSIGN_NOTE_KIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Assign_Note_nature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0acb3fff-35a3-45de-8f2c-66b87fe03a09")
    public void setAssign_Note_nature(final String value) {
        this.elt.putTagValue(AssignNote.MdaTypes.ASSIGN_NOTE_NATURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'Assign_Note_to'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0ab78ace-eb30-4e18-8119-de3c53f12cf5")
    public void setAssign_Note_to(final List<String> values) {
        this.elt.putTagValues(AssignNote.MdaTypes.ASSIGN_NOTE_TO_TAGTYPE_ELT, values);
    }

    @objid ("fde2dbc8-3396-4719-91d9-0193b535dd14")
    protected AssignNote(final Note elt) {
        this.elt = elt;
    }

    @objid ("2e4f820b-9dab-4975-8101-0b219132a3f8")
    public static final class MdaTypes {
        @objid ("198d2840-3140-4ff7-a5e9-fb0854a93c25")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a25e7074-2d54-4be5-8073-e3d610f3300f")
        public static TagType ASSIGN_NOTE_KIND_TAGTYPE_ELT;

        @objid ("4d341073-ded8-4fee-a21c-40cf4dad2bff")
        public static TagType ASSIGN_NOTE_NATURE_TAGTYPE_ELT;

        @objid ("1e268b96-52cf-4371-80fa-9330276b809e")
        public static TagType ASSIGN_NOTE_FROM_TAGTYPE_ELT;

        @objid ("4138054c-0148-43a0-8ff2-a65254e8db51")
        public static TagType ASSIGN_NOTE_TO_TAGTYPE_ELT;

        @objid ("9e078c70-85d1-4b2d-a450-0b575e9e0e6c")
        public static TagType ASSIGN_NOTE_IMPLIEDCONSTRAINT_TAGTYPE_ELT;

        @objid ("8dda25ab-8999-40cd-a5ab-901d4a694c3e")
        private static Stereotype MDAASSOCDEP;

        @objid ("1e8779b7-c66d-4bf9-9755-736cdc9b0265")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8dbaeb8d-ba2f-44c0-8975-7316949f2058")
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
