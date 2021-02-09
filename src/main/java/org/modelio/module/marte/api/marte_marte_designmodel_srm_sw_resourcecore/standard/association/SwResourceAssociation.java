/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.association;

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
public class SwResourceAssociation extends ResourceAssociation {
    public static final String STEREOTYPE_NAME = "SwResource_Association";

    public static final String SWRESOURCE_ASSOCIATION_CREATESERVICES_TAGTYPE = "SwResource_Association_createServices";

    public static final String SWRESOURCE_ASSOCIATION_DELETESERVICES_TAGTYPE = "SwResource_Association_deleteServices";

    public static final String SWRESOURCE_ASSOCIATION_IDENTIFIERELEMENTS_TAGTYPE = "SwResource_Association_identifierElements";

    public static final String SWRESOURCE_ASSOCIATION_INITIALIZESERVICES_TAGTYPE = "SwResource_Association_initializeServices";

    public static final String SWRESOURCE_ASSOCIATION_MEMORYSIZEFOOTPRINT_TAGTYPE = "SwResource_Association_memorySizeFootprint";

    public static final String SWRESOURCE_ASSOCIATION_STATEELEMENTS_TAGTYPE = "SwResource_Association_stateElements";

    /**
     * Tells whether a {@link SwResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << SwResource_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << SwResource_Association >> then instantiate a {@link SwResourceAssociation} proxy.
     * 
     * @return a {@link SwResourceAssociation} proxy on the created {@link Association}.
     */
    public static SwResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwResourceAssociation.STEREOTYPE_NAME);
        return SwResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link SwResourceAssociation} proxy from a {@link Association} stereotyped << SwResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link SwResourceAssociation} proxy or <i>null</i>.
     */
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
    public static SwResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (SwResourceAssociation.canInstantiate(obj))
        	return new SwResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("SwResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwResourceAssociation other = (SwResourceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwResource_Association_createServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwResource_Association_createServices() {
        return this.elt.getTagValues(SwResourceAssociation.MdaTypes.SWRESOURCE_ASSOCIATION_CREATESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Association_deleteServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwResource_Association_deleteServices() {
        return this.elt.getTagValues(SwResourceAssociation.MdaTypes.SWRESOURCE_ASSOCIATION_DELETESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Association_identifierElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwResource_Association_identifierElements() {
        return this.elt.getTagValues(SwResourceAssociation.MdaTypes.SWRESOURCE_ASSOCIATION_IDENTIFIERELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Association_initializeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwResource_Association_initializeServices() {
        return this.elt.getTagValues(SwResourceAssociation.MdaTypes.SWRESOURCE_ASSOCIATION_INITIALIZESERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwResource_Association_memorySizeFootprint'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwResource_Association_memorySizeFootprint() {
        return this.elt.getTagValue(SwResourceAssociation.MdaTypes.SWRESOURCE_ASSOCIATION_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwResource_Association_stateElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwResource_Association_stateElements() {
        return this.elt.getTagValues(SwResourceAssociation.MdaTypes.SWRESOURCE_ASSOCIATION_STATEELEMENTS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwResource_Association_createServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Association_createServices(final List<String> values) {
        this.elt.putTagValues(SwResourceAssociation.MdaTypes.SWRESOURCE_ASSOCIATION_CREATESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Association_deleteServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Association_deleteServices(final List<String> values) {
        this.elt.putTagValues(SwResourceAssociation.MdaTypes.SWRESOURCE_ASSOCIATION_DELETESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Association_identifierElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Association_identifierElements(final List<String> values) {
        this.elt.putTagValues(SwResourceAssociation.MdaTypes.SWRESOURCE_ASSOCIATION_IDENTIFIERELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwResource_Association_initializeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Association_initializeServices(final List<String> values) {
        this.elt.putTagValues(SwResourceAssociation.MdaTypes.SWRESOURCE_ASSOCIATION_INITIALIZESERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwResource_Association_memorySizeFootprint'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Association_memorySizeFootprint(final String value) {
        this.elt.putTagValue(SwResourceAssociation.MdaTypes.SWRESOURCE_ASSOCIATION_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwResource_Association_stateElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwResource_Association_stateElements(final List<String> values) {
        this.elt.putTagValues(SwResourceAssociation.MdaTypes.SWRESOURCE_ASSOCIATION_STATEELEMENTS_TAGTYPE_ELT, values);
    }

    protected SwResourceAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWRESOURCE_ASSOCIATION_IDENTIFIERELEMENTS_TAGTYPE_ELT;

        public static TagType SWRESOURCE_ASSOCIATION_STATEELEMENTS_TAGTYPE_ELT;

        public static TagType SWRESOURCE_ASSOCIATION_MEMORYSIZEFOOTPRINT_TAGTYPE_ELT;

        public static TagType SWRESOURCE_ASSOCIATION_CREATESERVICES_TAGTYPE_ELT;

        public static TagType SWRESOURCE_ASSOCIATION_DELETESERVICES_TAGTYPE_ELT;

        public static TagType SWRESOURCE_ASSOCIATION_INITIALIZESERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
