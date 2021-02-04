/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hlam.infrastructure.note;

import java.util.ArrayList;
import java.util.Collections;
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
 * Proxy class to handle a {@link Note} with << RtSpecification_Note >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("a4e560fa-8742-49f9-beec-db0c7987feeb")
public class RtSpecificationNote {
    @objid ("5eef9140-be59-464e-afd3-f214e642174d")
    public static final String STEREOTYPE_NAME = "RtSpecification_Note";

    @objid ("bf4ee013-7ee8-43fd-9de3-e6bf90c33107")
    public static final String RTSPECIFICATION_NOTE_ABSDL_TAGTYPE = "RtSpecification_Note_absDl";

    @objid ("609d5d54-402a-4d8d-92da-965ffece7232")
    public static final String RTSPECIFICATION_NOTE_BOUNDDL_TAGTYPE = "RtSpecification_Note_boundDl";

    @objid ("486f8161-4f31-4df9-bca5-4350dcf18f8d")
    public static final String RTSPECIFICATION_NOTE_CONTEXT_TAGTYPE = "RtSpecification_Note_context";

    @objid ("8fb0f0f4-d01d-4353-a85c-2751943d9e40")
    public static final String RTSPECIFICATION_NOTE_MISS_TAGTYPE = "RtSpecification_Note_miss";

    @objid ("8193f9e7-e6ca-4edb-8f63-bd54406edad1")
    public static final String RTSPECIFICATION_NOTE_OCCKIND_TAGTYPE = "RtSpecification_Note_occKind";

    @objid ("2d41e9e3-7aa6-4c62-81b6-b48657fcb135")
    public static final String RTSPECIFICATION_NOTE_PRIORITY_TAGTYPE = "RtSpecification_Note_priority";

    @objid ("a56f5003-888a-4a37-9d37-16df389ae41a")
    public static final String RTSPECIFICATION_NOTE_RDTIME_TAGTYPE = "RtSpecification_Note_rdTime";

    @objid ("4d5a19fc-b66d-4bb5-bb95-56d5f30bfef0")
    public static final String RTSPECIFICATION_NOTE_RELDL_TAGTYPE = "RtSpecification_Note_relDl";

    @objid ("4240c044-a419-49f8-8747-f67fc209f6de")
    public static final String RTSPECIFICATION_NOTE_TREF_TAGTYPE = "RtSpecification_Note_tRef";

    @objid ("5b87c747-ef2c-4a0f-b01c-f68b1f6319f1")
    public static final String RTSPECIFICATION_NOTE_UTILITY_TAGTYPE = "RtSpecification_Note_utility";

    /**
     * The underlying {@link Note} represented by this proxy, never null.
     */
    @objid ("830765bb-c678-4a56-8f37-b18b0d7dd337")
    protected final Note elt;

    /**
     * Tells whether a {@link RtSpecificationNote proxy} can be instantiated from a {@link MObject} checking it is a {@link Note} stereotyped << RtSpecification_Note >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("157052ad-3011-4b3a-821b-46cdd6de3ae6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Note) && ((Note) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, RtSpecificationNote.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Note} stereotyped << RtSpecification_Note >> then instantiate a {@link RtSpecificationNote} proxy.
     * 
     * @return a {@link RtSpecificationNote} proxy on the created {@link Note}.
     */
    @objid ("a8740296-ce5a-43a4-b8f0-696eaec232ab")
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
    @objid ("d5481697-a3c9-451d-902e-c6a6cbf2d400")
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
    @objid ("95985ea4-1650-4eba-a63d-5197474ad704")
    public static RtSpecificationNote safeInstantiate(final Note obj) throws IllegalArgumentException {
        if (RtSpecificationNote.canInstantiate(obj))
        	return new RtSpecificationNote(obj);
        else
        	throw new IllegalArgumentException("RtSpecificationNote: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c5c641f1-038e-460f-a2d7-211d94c73910")
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
    @objid ("19d5b289-e464-41dc-b67e-c5cd4151bb14")
    public Note getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'RtSpecification_Note_absDl'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4b1be70c-38eb-4b46-b359-14db199c4d43")
    public String getRtSpecification_Note_absDl() {
        return this.elt.getTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_ABSDL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtSpecification_Note_boundDl'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("02d2bc50-e4ca-4fdb-9297-51fb4661ba2c")
    public String getRtSpecification_Note_boundDl() {
        return this.elt.getTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_BOUNDDL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtSpecification_Note_context'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("884af08b-8d3f-4194-b973-0a8884bc43ff")
    public String getRtSpecification_Note_context() {
        return this.elt.getTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_CONTEXT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtSpecification_Note_miss'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b47352be-5f19-4ede-aa81-7c90adbc92b5")
    public String getRtSpecification_Note_miss() {
        return this.elt.getTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_MISS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtSpecification_Note_occKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e7f5d9d3-26fb-4135-a8da-dbeab21246a8")
    public String getRtSpecification_Note_occKind() {
        return this.elt.getTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_OCCKIND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtSpecification_Note_priority'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("51c35ab6-6110-4c58-828e-b46767bff568")
    public String getRtSpecification_Note_priority() {
        return this.elt.getTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_PRIORITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtSpecification_Note_rdTime'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("58e6bb0e-1b8a-4f26-95c2-04d096dd9e26")
    public String getRtSpecification_Note_rdTime() {
        return this.elt.getTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_RDTIME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtSpecification_Note_relDl'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8a3620e4-b1c9-4354-82be-bfa24a50c5d9")
    public String getRtSpecification_Note_relDl() {
        return this.elt.getTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_RELDL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtSpecification_Note_tRef'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e5863361-fc40-4b3a-9860-de8945e099cf")
    public String getRtSpecification_Note_tRef() {
        return this.elt.getTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_TREF_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtSpecification_Note_utility'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("17841e88-5203-4a1b-887b-67c770434f9f")
    public String getRtSpecification_Note_utility() {
        return this.elt.getTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_UTILITY_TAGTYPE_ELT);
    }

    @objid ("14ac106c-a347-4fc2-a865-587f19bd5f87")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'RtSpecification_Note_absDl'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a9c2abc8-739c-4c5c-90d7-659597862057")
    public void setRtSpecification_Note_absDl(final String value) {
        this.elt.putTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_ABSDL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtSpecification_Note_boundDl'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8a42b1d4-7e8b-423b-a303-b120539459f2")
    public void setRtSpecification_Note_boundDl(final String value) {
        this.elt.putTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_BOUNDDL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtSpecification_Note_context'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("07137969-fcb5-4f55-a953-cea3c98505d1")
    public void setRtSpecification_Note_context(final String value) {
        this.elt.putTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_CONTEXT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtSpecification_Note_miss'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b7666b28-cdb8-4a34-a30e-63a21833ab59")
    public void setRtSpecification_Note_miss(final String value) {
        this.elt.putTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_MISS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtSpecification_Note_occKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("00cc7d2b-06ee-4c43-bc57-aedaf8a889a4")
    public void setRtSpecification_Note_occKind(final String value) {
        this.elt.putTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_OCCKIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtSpecification_Note_priority'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("929fdfc8-2beb-430f-a362-d6c3d17c44e4")
    public void setRtSpecification_Note_priority(final String value) {
        this.elt.putTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_PRIORITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtSpecification_Note_rdTime'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1b9b0dbc-b09c-4610-bc35-964e8b294ce3")
    public void setRtSpecification_Note_rdTime(final String value) {
        this.elt.putTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_RDTIME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtSpecification_Note_relDl'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("45841af3-1fe7-4dfe-834c-fa19ea20001d")
    public void setRtSpecification_Note_relDl(final String value) {
        this.elt.putTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_RELDL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtSpecification_Note_tRef'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d882dd7d-2353-42da-a742-d68d72e284b6")
    public void setRtSpecification_Note_tRef(final String value) {
        this.elt.putTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_TREF_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtSpecification_Note_utility'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("33c6c94b-6802-44f5-888a-23b9e9362daf")
    public void setRtSpecification_Note_utility(final String value) {
        this.elt.putTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_UTILITY_TAGTYPE_ELT, value);
    }

    @objid ("da7e64c2-f22c-4006-910c-af9a5ffe5bb4")
    protected RtSpecificationNote(final Note elt) {
        this.elt = elt;
    }

    @objid ("ad2560c6-f5c5-48d8-9fd7-c74794af92c9")
    public static final class MdaTypes {
        @objid ("22363df7-088d-4f7c-985b-3e8bf72f1fba")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("07b84376-6503-4805-9ab1-d7df09c9e624")
        public static TagType RTSPECIFICATION_NOTE_UTILITY_TAGTYPE_ELT;

        @objid ("bc464ac3-ebb7-4fd7-b7b6-1622c4b6bbb8")
        public static TagType RTSPECIFICATION_NOTE_OCCKIND_TAGTYPE_ELT;

        @objid ("460ac496-b486-4b30-8768-f0b9229d8f7d")
        public static TagType RTSPECIFICATION_NOTE_TREF_TAGTYPE_ELT;

        @objid ("e45f8832-3106-4a0f-9d1b-7c8fef63417f")
        public static TagType RTSPECIFICATION_NOTE_RELDL_TAGTYPE_ELT;

        @objid ("7cf53008-3276-44ed-916a-bf828919e499")
        public static TagType RTSPECIFICATION_NOTE_ABSDL_TAGTYPE_ELT;

        @objid ("c86eb134-1fef-421b-b716-870ab0f33d1a")
        public static TagType RTSPECIFICATION_NOTE_BOUNDDL_TAGTYPE_ELT;

        @objid ("16bbe557-faa9-4573-9fca-a8cdf98cd22a")
        public static TagType RTSPECIFICATION_NOTE_RDTIME_TAGTYPE_ELT;

        @objid ("0a4665b3-b616-4a6b-a25a-f437e643d7a4")
        public static TagType RTSPECIFICATION_NOTE_MISS_TAGTYPE_ELT;

        @objid ("9a49d8ee-5f56-4748-8d8b-b195fb6d9b4b")
        public static TagType RTSPECIFICATION_NOTE_PRIORITY_TAGTYPE_ELT;

        @objid ("d9490882-3ce2-4ac2-a98c-c64246ded671")
        public static TagType RTSPECIFICATION_NOTE_CONTEXT_TAGTYPE_ELT;

        @objid ("14dc6224-022c-492f-a9e8-2d4c02aafb32")
        private static Stereotype MDAASSOCDEP;

        @objid ("8d192195-d424-47df-94e7-778e683c3b63")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c37bc058-9fd8-402f-8032-64573ea1951f")
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
