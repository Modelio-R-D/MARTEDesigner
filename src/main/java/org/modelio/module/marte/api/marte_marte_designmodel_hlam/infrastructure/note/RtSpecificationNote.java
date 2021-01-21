/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("0d79c691-5899-4743-ac54-c2e50f67a43c")
    public static final String STEREOTYPE_NAME = "RtSpecification_Note";

    @objid ("df0f55a1-7028-47f9-8272-41fb19b5e85e")
    public static final String RTSPECIFICATION_NOTE_ABSDL_TAGTYPE = "RtSpecification_Note_absDl";

    @objid ("da9d5c87-e424-4255-8426-0a1641c20b8a")
    public static final String RTSPECIFICATION_NOTE_BOUNDDL_TAGTYPE = "RtSpecification_Note_boundDl";

    @objid ("7065dd0b-5da4-4748-9c30-127c9bae0d6f")
    public static final String RTSPECIFICATION_NOTE_CONTEXT_TAGTYPE = "RtSpecification_Note_context";

    @objid ("72db5ca9-f5c0-4ef9-a0a0-ed290fbf7559")
    public static final String RTSPECIFICATION_NOTE_MISS_TAGTYPE = "RtSpecification_Note_miss";

    @objid ("c04f099f-4d23-4e7d-ae03-8ed9c6898a54")
    public static final String RTSPECIFICATION_NOTE_OCCKIND_TAGTYPE = "RtSpecification_Note_occKind";

    @objid ("4f18ddc8-786e-4ebe-85ad-b336355f9b4e")
    public static final String RTSPECIFICATION_NOTE_PRIORITY_TAGTYPE = "RtSpecification_Note_priority";

    @objid ("66b895fd-df97-4831-8f19-4d36be9307cb")
    public static final String RTSPECIFICATION_NOTE_RDTIME_TAGTYPE = "RtSpecification_Note_rdTime";

    @objid ("000f1d90-3e2d-4a06-8656-8f6179e1ad44")
    public static final String RTSPECIFICATION_NOTE_RELDL_TAGTYPE = "RtSpecification_Note_relDl";

    @objid ("371a5484-9cca-44af-a834-680ef1606b88")
    public static final String RTSPECIFICATION_NOTE_TREF_TAGTYPE = "RtSpecification_Note_tRef";

    @objid ("5de0eff2-36a8-48c6-a3a1-c8d5e5cc262a")
    public static final String RTSPECIFICATION_NOTE_UTILITY_TAGTYPE = "RtSpecification_Note_utility";

    /**
     * The underlying {@link Note} represented by this proxy, never null.
     */
    @objid ("54b6f849-d859-4b9a-95a3-1dac88bb445c")
    protected final Note elt;

    /**
     * Tells whether a {@link RtSpecificationNote proxy} can be instantiated from a {@link MObject} checking it is a {@link Note} stereotyped << RtSpecification_Note >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("61317b54-4b99-4296-ad8e-27c6ce527c6c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Note) && ((Note) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, RtSpecificationNote.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Note} stereotyped << RtSpecification_Note >> then instantiate a {@link RtSpecificationNote} proxy.
     * 
     * @return a {@link RtSpecificationNote} proxy on the created {@link Note}.
     */
    @objid ("658511ba-a44e-45c4-9dd8-f8d71e5a1e8a")
    public static RtSpecificationNote create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Note");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, RtSpecificationNote.STEREOTYPE_NAME);
        return RtSpecificationNote.instantiate((Note)e);
    }

    /**
     * Tries to instantiate a {@link RtSpecificationNote} proxy from a {@link Note} stereotyped << RtSpecification_Note >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Note
     * @return a {@link RtSpecificationNote} proxy or <i>null</i>.
     */
    @objid ("bab4a506-9a81-4c1a-b107-c9fdfa805b7a")
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
    @objid ("b9a4e101-b025-4224-ba57-439e67371750")
    public static RtSpecificationNote safeInstantiate(final Note obj) throws IllegalArgumentException {
        if (RtSpecificationNote.canInstantiate(obj))
        	return new RtSpecificationNote(obj);
        else
        	throw new IllegalArgumentException("RtSpecificationNote: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d3f2e618-7051-4820-b7e4-2ff251b4a204")
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
    @objid ("c6bc6da5-4c04-4406-a865-4f74d0a95e92")
    public Note getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'RtSpecification_Note_absDl'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bf7ec904-4e17-4788-a260-760115ae36ce")
    public String getRtSpecification_Note_absDl() {
        return this.elt.getTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_ABSDL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtSpecification_Note_boundDl'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c47e777f-e69f-4b57-ac3d-db7f8a98c176")
    public String getRtSpecification_Note_boundDl() {
        return this.elt.getTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_BOUNDDL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtSpecification_Note_context'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9fbbb298-82a1-439b-aec1-92e829750c85")
    public String getRtSpecification_Note_context() {
        return this.elt.getTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_CONTEXT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtSpecification_Note_miss'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c34b4d34-0d4d-4f3e-b818-3b74e2e1de22")
    public String getRtSpecification_Note_miss() {
        return this.elt.getTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_MISS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtSpecification_Note_occKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3c6d8812-7524-4db6-b830-3505cad1e459")
    public String getRtSpecification_Note_occKind() {
        return this.elt.getTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_OCCKIND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtSpecification_Note_priority'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a1e676fc-f694-4829-bd58-00183585292c")
    public String getRtSpecification_Note_priority() {
        return this.elt.getTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_PRIORITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtSpecification_Note_rdTime'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("88cd0098-e0c1-4eb7-b000-b88887f08e66")
    public String getRtSpecification_Note_rdTime() {
        return this.elt.getTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_RDTIME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtSpecification_Note_relDl'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4fda8bac-c5ef-4c05-b188-fd46866fbe65")
    public String getRtSpecification_Note_relDl() {
        return this.elt.getTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_RELDL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtSpecification_Note_tRef'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d12dffd4-50ca-47c6-9ccd-35934a0780c6")
    public String getRtSpecification_Note_tRef() {
        return this.elt.getTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_TREF_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtSpecification_Note_utility'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("48b09780-3493-4952-9fc5-1e0c54f8369a")
    public String getRtSpecification_Note_utility() {
        return this.elt.getTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_UTILITY_TAGTYPE_ELT);
    }

    @objid ("3b69ba31-add3-4bb9-9f2c-0cd58e5d93f1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'RtSpecification_Note_absDl'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b50100f1-5cfe-4634-9e93-ec1f8d589b39")
    public void setRtSpecification_Note_absDl(final String value) {
        this.elt.putTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_ABSDL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtSpecification_Note_boundDl'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("70b636e9-2337-4e90-9aa2-a5a6b39c15dd")
    public void setRtSpecification_Note_boundDl(final String value) {
        this.elt.putTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_BOUNDDL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtSpecification_Note_context'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d998596c-f827-47c6-b2f9-bc841be6736a")
    public void setRtSpecification_Note_context(final String value) {
        this.elt.putTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_CONTEXT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtSpecification_Note_miss'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c7b5bd5d-0de1-4afa-a0c8-f25b94407b48")
    public void setRtSpecification_Note_miss(final String value) {
        this.elt.putTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_MISS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtSpecification_Note_occKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7c7f0007-01e4-405a-95ee-8a62779066e0")
    public void setRtSpecification_Note_occKind(final String value) {
        this.elt.putTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_OCCKIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtSpecification_Note_priority'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8fee656d-8f18-4af2-8a97-462319ed1d64")
    public void setRtSpecification_Note_priority(final String value) {
        this.elt.putTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_PRIORITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtSpecification_Note_rdTime'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c75f5473-d1b2-446c-8538-362dbea3c442")
    public void setRtSpecification_Note_rdTime(final String value) {
        this.elt.putTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_RDTIME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtSpecification_Note_relDl'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("99a6ef4b-42f6-4742-b029-45107db98163")
    public void setRtSpecification_Note_relDl(final String value) {
        this.elt.putTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_RELDL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtSpecification_Note_tRef'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b0576d82-b92d-4bf3-8647-bdcf4d9000ea")
    public void setRtSpecification_Note_tRef(final String value) {
        this.elt.putTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_TREF_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtSpecification_Note_utility'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ccd08f0a-a6d8-4b46-8d78-232b1aac7b67")
    public void setRtSpecification_Note_utility(final String value) {
        this.elt.putTagValue(RtSpecificationNote.MdaTypes.RTSPECIFICATION_NOTE_UTILITY_TAGTYPE_ELT, value);
    }

    @objid ("27d9760f-00e0-4361-9039-b0a4a6b94260")
    protected RtSpecificationNote(final Note elt) {
        this.elt = elt;
    }

    @objid ("ad2560c6-f5c5-48d8-9fd7-c74794af92c9")
    public static final class MdaTypes {
        @objid ("36e59b2b-192a-4a5a-98a6-1249ffb915de")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7c771ca6-06b2-44bf-9389-422dfc2aa1f0")
        public static TagType RTSPECIFICATION_NOTE_UTILITY_TAGTYPE_ELT;

        @objid ("3619b17a-e9d3-44dc-b09c-0a5a7d4a1089")
        public static TagType RTSPECIFICATION_NOTE_OCCKIND_TAGTYPE_ELT;

        @objid ("1a0afc82-acf6-4861-967b-def9214c8456")
        public static TagType RTSPECIFICATION_NOTE_TREF_TAGTYPE_ELT;

        @objid ("b0b88593-289e-45e8-861f-788a7da6dc54")
        public static TagType RTSPECIFICATION_NOTE_RELDL_TAGTYPE_ELT;

        @objid ("12d77dd0-df14-4eba-9d21-ce2715435715")
        public static TagType RTSPECIFICATION_NOTE_ABSDL_TAGTYPE_ELT;

        @objid ("8c47ffe0-c6ea-48b8-bd5e-01f3e9808bbf")
        public static TagType RTSPECIFICATION_NOTE_BOUNDDL_TAGTYPE_ELT;

        @objid ("be221d8a-5ea5-4815-acb4-228ef60b1fb8")
        public static TagType RTSPECIFICATION_NOTE_RDTIME_TAGTYPE_ELT;

        @objid ("8a756977-1001-43a6-8d54-db4440728ecf")
        public static TagType RTSPECIFICATION_NOTE_MISS_TAGTYPE_ELT;

        @objid ("efd3acda-1f9e-4a18-9c30-07fac9ec3ac5")
        public static TagType RTSPECIFICATION_NOTE_PRIORITY_TAGTYPE_ELT;

        @objid ("04e5ee3f-9cba-4528-af88-7c872aba0306")
        public static TagType RTSPECIFICATION_NOTE_CONTEXT_TAGTYPE_ELT;

        @objid ("296ff923-a7de-497c-a97b-dfd0fc11a743")
        private static Stereotype MDAASSOCDEP;

        @objid ("b35ce91f-54e0-49e3-9ad2-30f102c59005")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7eb6f1f6-a51a-4fa3-b33f-5111efe582ee")
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
