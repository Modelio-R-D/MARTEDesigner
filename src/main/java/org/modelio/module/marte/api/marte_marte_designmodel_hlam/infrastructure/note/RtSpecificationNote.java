/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hlam.infrastructure.note;

import java.util.ArrayList;
import java.util.Collections;
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
 * Proxy class to handle a {@link Note} with << RtSpecification_Note >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class RtSpecificationNote {
    public static final String STEREOTYPE_NAME = "RtSpecification_Note";

    public static final String RTSPECIFICATION_NOTE_ABSDL_TAGTYPE = "RtSpecification_Note_absDl";

    public static final String RTSPECIFICATION_NOTE_BOUNDDL_TAGTYPE = "RtSpecification_Note_boundDl";

    public static final String RTSPECIFICATION_NOTE_CONTEXT_TAGTYPE = "RtSpecification_Note_context";

    public static final String RTSPECIFICATION_NOTE_MISS_TAGTYPE = "RtSpecification_Note_miss";

    public static final String RTSPECIFICATION_NOTE_OCCKIND_TAGTYPE = "RtSpecification_Note_occKind";

    public static final String RTSPECIFICATION_NOTE_PRIORITY_TAGTYPE = "RtSpecification_Note_priority";

    public static final String RTSPECIFICATION_NOTE_RDTIME_TAGTYPE = "RtSpecification_Note_rdTime";

    public static final String RTSPECIFICATION_NOTE_RELDL_TAGTYPE = "RtSpecification_Note_relDl";

    public static final String RTSPECIFICATION_NOTE_TREF_TAGTYPE = "RtSpecification_Note_tRef";

    public static final String RTSPECIFICATION_NOTE_UTILITY_TAGTYPE = "RtSpecification_Note_utility";

    /**
     * The underlying {@link Note} represented by this proxy, never null.
     */
    protected final Note elt;

    /**
     * Tells whether a {@link RtSpecificationNote proxy} can be instantiated from a {@link MObject} checking it is a {@link Note} stereotyped << RtSpecification_Note >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Note) && ((Note) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, RtSpecificationNote.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Note} stereotyped << RtSpecification_Note >> then instantiate a {@link RtSpecificationNote} proxy.
     * 
     * @return a {@link RtSpecificationNote} proxy on the created {@link Note}.
     */
    public static RtSpecificationNote create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Note");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, RtSpecificationNote.STEREOTYPE_NAME);
        return RtSpecificationNote.instantiate((Note)e);
    }

    /**
     * Tries to instantiate a {@link RtSpecificationNote} proxy from a {@link Note} stereotyped << RtSpecification_Note >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Note
     * @return a {@link RtSpecificationNote} proxy or <i>null</i>.
     */
    public static RtSpecificationNote instantiate(final Note obj) {
        return RtSpecificationNote.canInstantiate(obj) ? new RtSpecificationNote(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RtSpecificationNote} proxy from a {@link Note} stereotyped << RtSpecification_Note >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Note}
     * @return a {@link RtSpecificationNote} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static RtSpecificationNote safeInstantiate(final Note obj) throws IllegalArgumentException {
        if (RtSpecificationNote.canInstantiate(obj))
        	return new RtSpecificationNote(obj);
        else
        	throw new IllegalArgumentException("RtSpecificationNote: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        RtSpecificationNote other = (RtSpecificationNote) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Note}. 
     * @return the Note represented by this proxy, never null.
     */
    public Note getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'RtSpecification_Note_absDl'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtSpecification_Note_absDl() {
        return this.elt.getTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_ABSDL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtSpecification_Note_boundDl'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtSpecification_Note_boundDl() {
        return this.elt.getTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_BOUNDDL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtSpecification_Note_context'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtSpecification_Note_context() {
        return this.elt.getTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_CONTEXT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtSpecification_Note_miss'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtSpecification_Note_miss() {
        return this.elt.getTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_MISS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtSpecification_Note_occKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtSpecification_Note_occKind() {
        return this.elt.getTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_OCCKIND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtSpecification_Note_priority'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtSpecification_Note_priority() {
        return this.elt.getTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_PRIORITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtSpecification_Note_rdTime'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtSpecification_Note_rdTime() {
        return this.elt.getTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_RDTIME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtSpecification_Note_relDl'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtSpecification_Note_relDl() {
        return this.elt.getTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_RELDL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtSpecification_Note_tRef'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtSpecification_Note_tRef() {
        return this.elt.getTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_TREF_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtSpecification_Note_utility'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtSpecification_Note_utility() {
        return this.elt.getTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_UTILITY_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'RtSpecification_Note_absDl'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtSpecification_Note_absDl(final String value) {
        this.elt.putTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_ABSDL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtSpecification_Note_boundDl'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtSpecification_Note_boundDl(final String value) {
        this.elt.putTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_BOUNDDL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtSpecification_Note_context'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtSpecification_Note_context(final String value) {
        this.elt.putTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_CONTEXT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtSpecification_Note_miss'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtSpecification_Note_miss(final String value) {
        this.elt.putTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_MISS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtSpecification_Note_occKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtSpecification_Note_occKind(final String value) {
        this.elt.putTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_OCCKIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtSpecification_Note_priority'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtSpecification_Note_priority(final String value) {
        this.elt.putTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_PRIORITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtSpecification_Note_rdTime'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtSpecification_Note_rdTime(final String value) {
        this.elt.putTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_RDTIME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtSpecification_Note_relDl'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtSpecification_Note_relDl(final String value) {
        this.elt.putTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_RELDL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtSpecification_Note_tRef'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtSpecification_Note_tRef(final String value) {
        this.elt.putTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_TREF_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtSpecification_Note_utility'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtSpecification_Note_utility(final String value) {
        this.elt.putTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_UTILITY_TAGTYPE_ELT, value);
    }

    protected RtSpecificationNote(final Note elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType RTSPECIFICATION_NOTE_UTILITY_TAGTYPE_ELT;

        public static TagType RTSPECIFICATION_NOTE_OCCKIND_TAGTYPE_ELT;

        public static TagType RTSPECIFICATION_NOTE_TREF_TAGTYPE_ELT;

        public static TagType RTSPECIFICATION_NOTE_RELDL_TAGTYPE_ELT;

        public static TagType RTSPECIFICATION_NOTE_ABSDL_TAGTYPE_ELT;

        public static TagType RTSPECIFICATION_NOTE_BOUNDDL_TAGTYPE_ELT;

        public static TagType RTSPECIFICATION_NOTE_RDTIME_TAGTYPE_ELT;

        public static TagType RTSPECIFICATION_NOTE_MISS_TAGTYPE_ELT;

        public static TagType RTSPECIFICATION_NOTE_PRIORITY_TAGTYPE_ELT;

        public static TagType RTSPECIFICATION_NOTE_CONTEXT_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b96d3dd7-1237-11df-8f55-0014222a9f79");
            RTSPECIFICATION_NOTE_UTILITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "bb47b5b0-1237-11df-8f55-0014222a9f79");
            RTSPECIFICATION_NOTE_OCCKIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "bf3698c8-1237-11df-8f55-0014222a9f79");
            RTSPECIFICATION_NOTE_TREF_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c5cea1f6-1237-11df-8f55-0014222a9f79");
            RTSPECIFICATION_NOTE_RELDL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0137ab2a-1238-11df-8f55-0014222a9f79");
            RTSPECIFICATION_NOTE_ABSDL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "06de8e76-1238-11df-8f55-0014222a9f79");
            RTSPECIFICATION_NOTE_BOUNDDL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0bc66fa2-1238-11df-8f55-0014222a9f79");
            RTSPECIFICATION_NOTE_RDTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "10b7ddb6-1238-11df-8f55-0014222a9f79");
            RTSPECIFICATION_NOTE_MISS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "16b97b9e-1238-11df-8f55-0014222a9f79");
            RTSPECIFICATION_NOTE_PRIORITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1a912cf6-1238-11df-8f55-0014222a9f79");
            RTSPECIFICATION_NOTE_CONTEXT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "21305fd2-1238-11df-8f55-0014222a9f79");
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
