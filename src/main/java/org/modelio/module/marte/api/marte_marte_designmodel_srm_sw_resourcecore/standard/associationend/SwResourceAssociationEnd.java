/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("9aecae7a-e65b-401e-b534-8e51b3131b62")
    public static final String STEREOTYPE_NAME = "SwResource_AssociationEnd";

    @objid ("a3e47525-35a1-4b59-956e-785219ddbf38")
    public static final String SWRESOURCE_ASSOCIATIONEND_CREATESERVICES_TAGTYPE = "SwResource_AssociationEnd_createServices";

    @objid ("cd0bd35d-528a-49b5-bb59-1abd0b641ec7")
    public static final String SWRESOURCE_ASSOCIATIONEND_DELETESERVICES_TAGTYPE = "SwResource_AssociationEnd_deleteServices";

    @objid ("f9f6e867-be56-473f-8796-99b4e00ae3b7")
    public static final String SWRESOURCE_ASSOCIATIONEND_IDENTIFIERELEMENTS_TAGTYPE = "SwResource_AssociationEnd_identifierElements";

    @objid ("abd57ece-4ec4-4774-9f05-fc09ae18d46d")
    public static final String SWRESOURCE_ASSOCIATIONEND_INITIALIZESERVICES_TAGTYPE = "SwResource_AssociationEnd_initializeServices";

    @objid ("4d13be72-0a5c-4e83-b179-6752575b9d2c")
    public static final String SWRESOURCE_ASSOCIATIONEND_MEMORYSIZEFOOTPRINT_TAGTYPE = "SwResource_AssociationEnd_memorySizeFootprint";

    @objid ("748cd47f-d139-4166-8402-3b263318c3b8")
    public static final String SWRESOURCE_ASSOCIATIONEND_STATEELEMENTS_TAGTYPE = "SwResource_AssociationEnd_stateElements";

    /**
     * Tells whether a {@link SwResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << SwResource_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3c2a1ddc-05c8-454e-84d2-b73fdcf8ddd7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << SwResource_AssociationEnd >> then instantiate a {@link SwResourceAssociationEnd} proxy.
     * 
     * @return a {@link SwResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("c9d05ac7-a19e-49e4-835d-b3662bae88f8")
    public static SwResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwResourceAssociationEnd.STEREOTYPE_NAME);
        return SwResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link SwResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SwResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link SwResourceAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("05c028a0-e49a-4b5f-959f-53d1965c1271")
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
    @objid ("cb4ba490-557e-4ffb-8a2f-bf1d0ec11be7")
    public static SwResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (SwResourceAssociationEnd.canInstantiate(obj))
        	return new SwResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("SwResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("75e5205d-361c-48f9-b1d2-d8626c717b30")
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
    @objid ("0888d7ab-e842-46a9-8c3f-b1df9d6a26ed")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwResource_AssociationEnd_createServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9faed199-c9cb-4228-ae57-7acd03843640")
    public List<String> getSwResource_AssociationEnd_createServices() {
        return this.elt.getTagValues(SwResourceAssociationEnd.MdaTypes.SWRESOURCE_ASSOCIATIONEND_CREATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_AssociationEnd_deleteServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3f94f340-3d9e-41e7-8338-84132734640d")
    public List<String> getSwResource_AssociationEnd_deleteServices() {
        return this.elt.getTagValues(SwResourceAssociationEnd.MdaTypes.SWRESOURCE_ASSOCIATIONEND_DELETESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_AssociationEnd_identifierElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3d296d3a-db3f-4923-b3a9-f6a6fc0a33aa")
    public List<String> getSwResource_AssociationEnd_identifierElements() {
        return this.elt.getTagValues(SwResourceAssociationEnd.MdaTypes.SWRESOURCE_ASSOCIATIONEND_IDENTIFIERELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_AssociationEnd_initializeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8196042b-d4f1-4d99-aaef-8c00e4d646e0")
    public List<String> getSwResource_AssociationEnd_initializeServices() {
        return this.elt.getTagValues(SwResourceAssociationEnd.MdaTypes.SWRESOURCE_ASSOCIATIONEND_INITIALIZESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwResource_AssociationEnd_memorySizeFootprint'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("489965b2-fe50-4a3c-b456-ad7d9dec6b7a")
    public String getSwResource_AssociationEnd_memorySizeFootprint() {
        return this.elt.getTagValue(SwResourceAssociationEnd.MdaTypes.SWRESOURCE_ASSOCIATIONEND_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_AssociationEnd_stateElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("7982fea3-acdc-4fdf-841e-4619f41c8581")
    public List<String> getSwResource_AssociationEnd_stateElements() {
        return this.elt.getTagValues(SwResourceAssociationEnd.MdaTypes.SWRESOURCE_ASSOCIATIONEND_STATEELEMENTS_TAGTYPE_ELT);
    }

    @objid ("5c98c7e0-1b6b-4c3c-984d-e5fedd93bd0d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwResource_AssociationEnd_createServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("98685d85-9b75-4fd3-9c3f-bba7dd47a67f")
    public void setSwResource_AssociationEnd_createServices(final List<String> values) {
        this.elt.putTagValues(SwResourceAssociationEnd.MdaTypes.SWRESOURCE_ASSOCIATIONEND_CREATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_AssociationEnd_deleteServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6c3a058e-28af-4001-a3ca-cc6c6cf87cd5")
    public void setSwResource_AssociationEnd_deleteServices(final List<String> values) {
        this.elt.putTagValues(SwResourceAssociationEnd.MdaTypes.SWRESOURCE_ASSOCIATIONEND_DELETESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_AssociationEnd_identifierElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("92b3813e-0a23-4076-8406-db824d0e1671")
    public void setSwResource_AssociationEnd_identifierElements(final List<String> values) {
        this.elt.putTagValues(SwResourceAssociationEnd.MdaTypes.SWRESOURCE_ASSOCIATIONEND_IDENTIFIERELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_AssociationEnd_initializeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b7fd3163-3eec-429e-b13c-87433c53b09f")
    public void setSwResource_AssociationEnd_initializeServices(final List<String> values) {
        this.elt.putTagValues(SwResourceAssociationEnd.MdaTypes.SWRESOURCE_ASSOCIATIONEND_INITIALIZESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwResource_AssociationEnd_memorySizeFootprint'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("169c277c-c1ac-477d-b7be-e69b59c2a790")
    public void setSwResource_AssociationEnd_memorySizeFootprint(final String value) {
        this.elt.putTagValue(SwResourceAssociationEnd.MdaTypes.SWRESOURCE_ASSOCIATIONEND_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwResource_AssociationEnd_stateElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f876fee7-be46-445b-a510-cf1dafcac3dd")
    public void setSwResource_AssociationEnd_stateElements(final List<String> values) {
        this.elt.putTagValues(SwResourceAssociationEnd.MdaTypes.SWRESOURCE_ASSOCIATIONEND_STATEELEMENTS_TAGTYPE_ELT, values);
    }

    @objid ("e3c5b8ca-7b58-453a-b37a-1bb07ee2f7b7")
    protected SwResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("dd190aaa-d0d9-4942-bbe9-121d83c742fe")
    public static final class MdaTypes {
        @objid ("bc72855d-52c0-46c3-be72-083c9d4ebaaf")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("27ec3ffe-91f7-462c-a7cb-3fd164d29b04")
        public static TagType SWRESOURCE_ASSOCIATIONEND_IDENTIFIERELEMENTS_TAGTYPE_ELT;

        @objid ("8ee915b9-a600-4872-84bb-84cbd3250c52")
        public static TagType SWRESOURCE_ASSOCIATIONEND_STATEELEMENTS_TAGTYPE_ELT;

        @objid ("b87b60ed-5407-468f-b722-88335e8ab197")
        public static TagType SWRESOURCE_ASSOCIATIONEND_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT;

        @objid ("92c65aa4-f8ec-4187-b37f-4e6d8dbd5b3f")
        public static TagType SWRESOURCE_ASSOCIATIONEND_CREATESERVICES_TAGTYPE_ELT;

        @objid ("396abe9e-dd9c-423c-99bf-8b3cba447516")
        public static TagType SWRESOURCE_ASSOCIATIONEND_DELETESERVICES_TAGTYPE_ELT;

        @objid ("294e5836-7df7-4aac-b20a-4d7e78d43c5e")
        public static TagType SWRESOURCE_ASSOCIATIONEND_INITIALIZESERVICES_TAGTYPE_ELT;

        @objid ("ac140691-4b96-4bc0-9f9f-47648581453b")
        private static Stereotype MDAASSOCDEP;

        @objid ("2b96b4cf-1fa5-4928-9af1-a0957c907ee7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5ec996c4-40be-4a6a-86c6-80e946e07a3c")
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
