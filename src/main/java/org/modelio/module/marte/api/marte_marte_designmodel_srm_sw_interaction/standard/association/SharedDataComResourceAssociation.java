/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.association;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << SharedDataComResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SharedDataComResourceAssociation extends SwCommunicationResourceAssociation {
    public static final String STEREOTYPE_NAME = "SharedDataComResource_Association";

    public static final String SHAREDDATACOMRESOURCE_ASSOCIATION_READSERVICES_TAGTYPE = "SharedDataComResource_Association_readServices";

    public static final String SHAREDDATACOMRESOURCE_ASSOCIATION_WRITESERVICES_TAGTYPE = "SharedDataComResource_Association_writeServices";

    /**
     * Tells whether a {@link SharedDataComResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << SharedDataComResource_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SharedDataComResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << SharedDataComResource_Association >> then instantiate a {@link SharedDataComResourceAssociation} proxy.
     * 
     * @return a {@link SharedDataComResourceAssociation} proxy on the created {@link Association}.
     */
    public static SharedDataComResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SharedDataComResourceAssociation.STEREOTYPE_NAME);
        return SharedDataComResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link SharedDataComResourceAssociation} proxy from a {@link Association} stereotyped << SharedDataComResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link SharedDataComResourceAssociation} proxy or <i>null</i>.
     */
    public static SharedDataComResourceAssociation instantiate(final Association obj) {
        return SharedDataComResourceAssociation.canInstantiate(obj) ? new SharedDataComResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SharedDataComResourceAssociation} proxy from a {@link Association} stereotyped << SharedDataComResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link SharedDataComResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SharedDataComResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (SharedDataComResourceAssociation.canInstantiate(obj))
        	return new SharedDataComResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("SharedDataComResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SharedDataComResourceAssociation other = (SharedDataComResourceAssociation) obj;
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
     * Getter for List<String> property 'SharedDataComResource_Association_readServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSharedDataComResource_Association_readServices() {
        return this.elt.getTagValues(SharedDataComResourceAssociation.MdaTypes.SHAREDDATACOMRESOURCE_ASSOCIATION_READSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SharedDataComResource_Association_writeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSharedDataComResource_Association_writeServices() {
        return this.elt.getTagValues(SharedDataComResourceAssociation.MdaTypes.SHAREDDATACOMRESOURCE_ASSOCIATION_WRITESERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SharedDataComResource_Association_readServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSharedDataComResource_Association_readServices(final List<String> values) {
        this.elt.putTagValues(SharedDataComResourceAssociation.MdaTypes.SHAREDDATACOMRESOURCE_ASSOCIATION_READSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SharedDataComResource_Association_writeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSharedDataComResource_Association_writeServices(final List<String> values) {
        this.elt.putTagValues(SharedDataComResourceAssociation.MdaTypes.SHAREDDATACOMRESOURCE_ASSOCIATION_WRITESERVICES_TAGTYPE_ELT, values);
    }

    protected SharedDataComResourceAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SHAREDDATACOMRESOURCE_ASSOCIATION_READSERVICES_TAGTYPE_ELT;

        public static TagType SHAREDDATACOMRESOURCE_ASSOCIATION_WRITESERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "2d8aa548-10d8-11df-81d9-0014222a9f79");
            SHAREDDATACOMRESOURCE_ASSOCIATION_READSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "2d8aa549-10d8-11df-81d9-0014222a9f79");
            SHAREDDATACOMRESOURCE_ASSOCIATION_WRITESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "2d8aa54a-10d8-11df-81d9-0014222a9f79");
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
