/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.associationend;

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
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.ResourceAssociationEnd;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << SwResource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b9827a27-4851-438f-b20a-dea2185c5a67")
public class SwResourceAssociationEnd extends ResourceAssociationEnd {
    @objid ("8a0aa7e4-e6a1-4962-b9fe-e90e0ece6c59")
    public static final String STEREOTYPE_NAME = "SwResource_AssociationEnd";

    @objid ("f8c190ea-c805-450c-84a3-e0f0fb6a11d7")
    public static final String SWRESOURCE_ASSOCIATIONEND_CREATESERVICES_TAGTYPE = "SwResource_AssociationEnd_createServices";

    @objid ("2d2091af-580d-41dd-ac69-70ecd003263b")
    public static final String SWRESOURCE_ASSOCIATIONEND_DELETESERVICES_TAGTYPE = "SwResource_AssociationEnd_deleteServices";

    @objid ("b00fe2a0-663b-44ff-8c2e-765acccec53d")
    public static final String SWRESOURCE_ASSOCIATIONEND_IDENTIFIERELEMENTS_TAGTYPE = "SwResource_AssociationEnd_identifierElements";

    @objid ("98fc954b-0a47-45a2-b64f-e741f6691152")
    public static final String SWRESOURCE_ASSOCIATIONEND_INITIALIZESERVICES_TAGTYPE = "SwResource_AssociationEnd_initializeServices";

    @objid ("31e105f1-fbe0-497f-9e8f-ff244dfc7a2f")
    public static final String SWRESOURCE_ASSOCIATIONEND_MEMORYSIZEFOOTPRINT_TAGTYPE = "SwResource_AssociationEnd_memorySizeFootprint";

    @objid ("053fe617-09cc-463c-91b3-90bee11d5d9a")
    public static final String SWRESOURCE_ASSOCIATIONEND_STATEELEMENTS_TAGTYPE = "SwResource_AssociationEnd_stateElements";

    /**
     * Tells whether a {@link SwResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << SwResource_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("50a39367-f355-46b9-9420-d5ce3e334d21")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << SwResource_AssociationEnd >> then instantiate a {@link SwResourceAssociationEnd} proxy.
     * 
     * @return a {@link SwResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("78d54664-a20c-4edf-be4d-6b08d5b145e4")
    public static SwResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwResourceAssociationEnd.STEREOTYPE_NAME);
        return SwResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link SwResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SwResource_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link SwResourceAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("581c1389-e214-42f9-96b4-d2236bb1621a")
    public static SwResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return SwResourceAssociationEnd.canInstantiate(obj) ? new SwResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SwResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link SwResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("89ad9421-fe8f-484b-aeea-eec4b6255887")
    public static SwResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (SwResourceAssociationEnd.canInstantiate(obj))
        	return new SwResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("SwResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7f096c9a-10af-409f-a517-9919644c5584")
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
        SwResourceAssociationEnd other = (SwResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("aedceaa9-1159-440f-8bc2-f77e2412108b")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwResource_AssociationEnd_createServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b0c025fc-dd1e-4d48-9aad-53f1839616fe")
    public List<String> getSwResource_AssociationEnd_createServices() {
        return this.elt.getTagValues(SwResourceAssociationEnd.MdaTypes.SWRESOURCE_ASSOCIATIONEND_CREATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_AssociationEnd_deleteServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ae1a8241-50b0-4579-a820-ca1ee6f2ed5d")
    public List<String> getSwResource_AssociationEnd_deleteServices() {
        return this.elt.getTagValues(SwResourceAssociationEnd.MdaTypes.SWRESOURCE_ASSOCIATIONEND_DELETESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_AssociationEnd_identifierElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d7c09c51-39cd-4076-80e1-38f35ddc99c8")
    public List<String> getSwResource_AssociationEnd_identifierElements() {
        return this.elt.getTagValues(SwResourceAssociationEnd.MdaTypes.SWRESOURCE_ASSOCIATIONEND_IDENTIFIERELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_AssociationEnd_initializeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b1c8a353-26cc-45e4-be52-46441856f11d")
    public List<String> getSwResource_AssociationEnd_initializeServices() {
        return this.elt.getTagValues(SwResourceAssociationEnd.MdaTypes.SWRESOURCE_ASSOCIATIONEND_INITIALIZESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwResource_AssociationEnd_memorySizeFootprint'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f61e5e80-e49c-4111-93ec-ff4c84abd165")
    public String getSwResource_AssociationEnd_memorySizeFootprint() {
        return this.elt.getTagValue(SwResourceAssociationEnd.MdaTypes.SWRESOURCE_ASSOCIATIONEND_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_AssociationEnd_stateElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("32300dd3-03a2-4a00-af5d-62936985a57e")
    public List<String> getSwResource_AssociationEnd_stateElements() {
        return this.elt.getTagValues(SwResourceAssociationEnd.MdaTypes.SWRESOURCE_ASSOCIATIONEND_STATEELEMENTS_TAGTYPE_ELT);
    }

    @objid ("f3c84f4d-1e2f-4e55-be90-3a14f77e1a45")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwResource_AssociationEnd_createServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8cdc181b-5379-47ce-a0b0-00a41f1128b4")
    public void setSwResource_AssociationEnd_createServices(final List<String> values) {
        this.elt.putTagValues(SwResourceAssociationEnd.MdaTypes.SWRESOURCE_ASSOCIATIONEND_CREATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_AssociationEnd_deleteServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3a965610-28af-42ba-97ac-e4b0d5492884")
    public void setSwResource_AssociationEnd_deleteServices(final List<String> values) {
        this.elt.putTagValues(SwResourceAssociationEnd.MdaTypes.SWRESOURCE_ASSOCIATIONEND_DELETESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_AssociationEnd_identifierElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("260325d1-ac14-4450-9fd6-9f8543364d11")
    public void setSwResource_AssociationEnd_identifierElements(final List<String> values) {
        this.elt.putTagValues(SwResourceAssociationEnd.MdaTypes.SWRESOURCE_ASSOCIATIONEND_IDENTIFIERELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_AssociationEnd_initializeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f2fcd1f2-16a5-4cde-9718-ae292a3ddfad")
    public void setSwResource_AssociationEnd_initializeServices(final List<String> values) {
        this.elt.putTagValues(SwResourceAssociationEnd.MdaTypes.SWRESOURCE_ASSOCIATIONEND_INITIALIZESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwResource_AssociationEnd_memorySizeFootprint'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("da8425ca-9bb3-4b1e-a06a-00eb9849c5e1")
    public void setSwResource_AssociationEnd_memorySizeFootprint(final String value) {
        this.elt.putTagValue(SwResourceAssociationEnd.MdaTypes.SWRESOURCE_ASSOCIATIONEND_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwResource_AssociationEnd_stateElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("53194992-4b10-48d7-8988-2e1f1f418f07")
    public void setSwResource_AssociationEnd_stateElements(final List<String> values) {
        this.elt.putTagValues(SwResourceAssociationEnd.MdaTypes.SWRESOURCE_ASSOCIATIONEND_STATEELEMENTS_TAGTYPE_ELT, values);
    }

    @objid ("c8f01552-f710-4b81-b826-420bb7334aab")
    protected SwResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("dd190aaa-d0d9-4942-bbe9-121d83c742fe")
    public static final class MdaTypes {
        @objid ("cbd3cb2b-8e62-4306-9726-2b87025b14d8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("58b2ffd9-b41e-4a44-9eed-c6e8526eb4e1")
        public static TagType SWRESOURCE_ASSOCIATIONEND_IDENTIFIERELEMENTS_TAGTYPE_ELT;

        @objid ("84017be8-1f1f-4b49-b0a1-05da567ee343")
        public static TagType SWRESOURCE_ASSOCIATIONEND_STATEELEMENTS_TAGTYPE_ELT;

        @objid ("8090cbc6-6fa6-4c1b-b3ae-bccd9d013820")
        public static TagType SWRESOURCE_ASSOCIATIONEND_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT;

        @objid ("586abb2e-8207-4a20-8a8c-afe61ab79500")
        public static TagType SWRESOURCE_ASSOCIATIONEND_CREATESERVICES_TAGTYPE_ELT;

        @objid ("4403a7cd-4a09-4949-8194-2981554a42f5")
        public static TagType SWRESOURCE_ASSOCIATIONEND_DELETESERVICES_TAGTYPE_ELT;

        @objid ("86ad948d-e800-4145-9ffc-8e92f02b5f20")
        public static TagType SWRESOURCE_ASSOCIATIONEND_INITIALIZESERVICES_TAGTYPE_ELT;

        @objid ("411878a8-1704-4250-9f01-71858bf9e1e7")
        private static Stereotype MDAASSOCDEP;

        @objid ("782704d8-b5fa-4982-ad1b-d9816cd2fa7d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("02ddcf30-acf2-4b9f-960c-0953ef982eb8")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01a3265c-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_ASSOCIATIONEND_IDENTIFIERELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a32663-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_ASSOCIATIONEND_STATEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a3266a-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_ASSOCIATIONEND_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a32671-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_ASSOCIATIONEND_CREATESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a588b1-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_ASSOCIATIONEND_DELETESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a588b8-0ccf-11df-8525-001302895b2b");
            SWRESOURCE_ASSOCIATIONEND_INITIALIZESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a588bf-0ccf-11df-8525-001302895b2b");
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
