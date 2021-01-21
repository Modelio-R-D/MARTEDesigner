/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.ResourceAssociation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << SwResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("242b9d5e-78a9-4342-8933-69771cf474b9")
public class SwResourceAssociation extends ResourceAssociation {
    @objid ("a969bfd9-9edf-475c-babe-dfcd7fe6a113")
    public static final String STEREOTYPE_NAME = "SwResource_Association";

    @objid ("2276c18d-84c9-4f78-af5d-bd3872038bb5")
    public static final String SWRESOURCE_ASSOCIATION_CREATESERVICES_TAGTYPE = "SwResource_Association_createServices";

    @objid ("141af162-f58e-44b5-b8fd-d6c542e3bc6c")
    public static final String SWRESOURCE_ASSOCIATION_DELETESERVICES_TAGTYPE = "SwResource_Association_deleteServices";

    @objid ("b575a89d-2d88-455c-9324-9168d4f6e252")
    public static final String SWRESOURCE_ASSOCIATION_IDENTIFIERELEMENTS_TAGTYPE = "SwResource_Association_identifierElements";

    @objid ("85f7d3cf-120e-4d84-a69a-5f4bcc87f9fa")
    public static final String SWRESOURCE_ASSOCIATION_INITIALIZESERVICES_TAGTYPE = "SwResource_Association_initializeServices";

    @objid ("5e430f3f-3009-448d-9316-208921c54e6a")
    public static final String SWRESOURCE_ASSOCIATION_MEMORYSIZEFOOTPRINT_TAGTYPE = "SwResource_Association_memorySizeFootprint";

    @objid ("57a50bf6-bb4b-49ea-8518-ea1a1b3750bd")
    public static final String SWRESOURCE_ASSOCIATION_STATEELEMENTS_TAGTYPE = "SwResource_Association_stateElements";

    /**
     * Tells whether a {@link SwResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << SwResource_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("6b61557a-2efc-43e1-b610-3337645e8c3b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << SwResource_Association >> then instantiate a {@link SwResourceAssociation} proxy.
     * 
     * @return a {@link SwResourceAssociation} proxy on the created {@link Association}.
     */
    @objid ("383e2592-c6df-4f0f-9ad1-876f4024ee14")
    public static SwResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwResourceAssociation.STEREOTYPE_NAME);
        return SwResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link SwResourceAssociation} proxy from a {@link Association} stereotyped << SwResource_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link SwResourceAssociation} proxy or <i>null</i>.
     */
    @objid ("0dc42c4d-1bee-4789-95e2-51f0d22b4cfa")
    public static SwResourceAssociation instantiate(final Association obj) {
        return SwResourceAssociation.canInstantiate(obj) ? new SwResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwResourceAssociation} proxy from a {@link Association} stereotyped << SwResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link SwResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("70681a8c-8f47-4f03-9d5e-be9a6b8b90b9")
    public static SwResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (SwResourceAssociation.canInstantiate(obj))
        	return new SwResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("SwResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3a14a6f9-72c2-4611-913e-1a2817e62334")
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
        SwResourceAssociation other = (SwResourceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("2834f952-b145-4d9e-a5eb-361e4f7267af")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwResource_Association_createServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("31f25da0-2c18-4e81-8337-71645d0ceca1")
    public List<String> getSwResource_Association_createServices() {
        return this.elt.getTagValues(SwResourceAssociation.MdaTypes.SWRESOURCE_ASSOCIATION_CREATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Association_deleteServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9bf2dda6-1d4b-4779-9532-0c0dd765cfaa")
    public List<String> getSwResource_Association_deleteServices() {
        return this.elt.getTagValues(SwResourceAssociation.MdaTypes.SWRESOURCE_ASSOCIATION_DELETESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Association_identifierElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("81357511-54c4-400a-bef8-4791ebc2de16")
    public List<String> getSwResource_Association_identifierElements() {
        return this.elt.getTagValues(SwResourceAssociation.MdaTypes.SWRESOURCE_ASSOCIATION_IDENTIFIERELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Association_initializeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e28088e8-7e5d-4ab0-a9e9-34bd0fab304c")
    public List<String> getSwResource_Association_initializeServices() {
        return this.elt.getTagValues(SwResourceAssociation.MdaTypes.SWRESOURCE_ASSOCIATION_INITIALIZESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwResource_Association_memorySizeFootprint'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d95de620-aea1-4baf-881f-62244f19bfd9")
    public String getSwResource_Association_memorySizeFootprint() {
        return this.elt.getTagValue(SwResourceAssociation.MdaTypes.SWRESOURCE_ASSOCIATION_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Association_stateElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("2e8fae5e-25b7-4080-868f-67671b241ed9")
    public List<String> getSwResource_Association_stateElements() {
        return this.elt.getTagValues(SwResourceAssociation.MdaTypes.SWRESOURCE_ASSOCIATION_STATEELEMENTS_TAGTYPE_ELT);
    }

    @objid ("04617a39-4045-41d4-a19a-ea8422aaf24e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwResource_Association_createServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5b1280f5-4c12-4e23-9b0c-f50258373f04")
    public void setSwResource_Association_createServices(final List<String> values) {
        this.elt.putTagValues(SwResourceAssociation.MdaTypes.SWRESOURCE_ASSOCIATION_CREATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Association_deleteServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("468c1a9e-ef66-433b-895f-a37fbfd5977e")
    public void setSwResource_Association_deleteServices(final List<String> values) {
        this.elt.putTagValues(SwResourceAssociation.MdaTypes.SWRESOURCE_ASSOCIATION_DELETESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Association_identifierElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7ceda22e-0694-4f01-bbbd-58720cfd0888")
    public void setSwResource_Association_identifierElements(final List<String> values) {
        this.elt.putTagValues(SwResourceAssociation.MdaTypes.SWRESOURCE_ASSOCIATION_IDENTIFIERELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Association_initializeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("688f6247-75fc-44ed-8e64-b07cf3fdcae6")
    public void setSwResource_Association_initializeServices(final List<String> values) {
        this.elt.putTagValues(SwResourceAssociation.MdaTypes.SWRESOURCE_ASSOCIATION_INITIALIZESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwResource_Association_memorySizeFootprint'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("42a1906d-85d1-4d5a-a729-6a0d6c416b26")
    public void setSwResource_Association_memorySizeFootprint(final String value) {
        this.elt.putTagValue(SwResourceAssociation.MdaTypes.SWRESOURCE_ASSOCIATION_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwResource_Association_stateElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("21f002b8-b7d2-42f5-ab55-61de37894975")
    public void setSwResource_Association_stateElements(final List<String> values) {
        this.elt.putTagValues(SwResourceAssociation.MdaTypes.SWRESOURCE_ASSOCIATION_STATEELEMENTS_TAGTYPE_ELT, values);
    }

    @objid ("68526bb3-c0dc-458f-8983-2de3e57bb8d4")
    protected SwResourceAssociation(final Association elt) {
        super(elt);
    }

    @objid ("76537e69-9da3-42f9-a25a-6945ae7f2c7e")
    public static final class MdaTypes {
        @objid ("d4ddacf5-fea3-45de-b784-b02b2f230a74")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0f57b605-ec98-4f05-9c56-9d1be274f32e")
        public static TagType SWRESOURCE_ASSOCIATION_IDENTIFIERELEMENTS_TAGTYPE_ELT;

        @objid ("c7652b80-be56-4e8d-b476-9087215c4d26")
        public static TagType SWRESOURCE_ASSOCIATION_STATEELEMENTS_TAGTYPE_ELT;

        @objid ("2ee65cdd-61d5-4e5b-9681-0714990d62bc")
        public static TagType SWRESOURCE_ASSOCIATION_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT;

        @objid ("c62c28ac-b0c5-49c1-bc77-ee13e21c4d10")
        public static TagType SWRESOURCE_ASSOCIATION_CREATESERVICES_TAGTYPE_ELT;

        @objid ("2652a2c1-83af-4c0e-9ee2-dcfcea283520")
        public static TagType SWRESOURCE_ASSOCIATION_DELETESERVICES_TAGTYPE_ELT;

        @objid ("922108ac-8b18-4301-9238-b497b4f23621")
        public static TagType SWRESOURCE_ASSOCIATION_INITIALIZESERVICES_TAGTYPE_ELT;

        @objid ("4405549f-d447-49bb-a847-c0fd3a21c5ec")
        private static Stereotype MDAASSOCDEP;

        @objid ("7d7330da-ee7c-4899-b621-98ddef3c1049")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5349de97-0bd3-4cfd-836c-491c79950951")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "3e58228c-10c0-11df-81d9-0014222a9f79");
            SWRESOURCE_ASSOCIATION_IDENTIFIERELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3e582291-10c0-11df-81d9-0014222a9f79");
            SWRESOURCE_ASSOCIATION_STATEELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3e582292-10c0-11df-81d9-0014222a9f79");
            SWRESOURCE_ASSOCIATION_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3e58228d-10c0-11df-81d9-0014222a9f79");
            SWRESOURCE_ASSOCIATION_CREATESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3e58228e-10c0-11df-81d9-0014222a9f79");
            SWRESOURCE_ASSOCIATION_DELETESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3e58228f-10c0-11df-81d9-0014222a9f79");
            SWRESOURCE_ASSOCIATION_INITIALIZESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3e582290-10c0-11df-81d9-0014222a9f79");
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
