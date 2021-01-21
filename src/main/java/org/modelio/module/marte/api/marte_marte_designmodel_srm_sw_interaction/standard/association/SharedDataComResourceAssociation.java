/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.association;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << SharedDataComResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("a8e16325-9821-4166-b9a0-d760061d54cf")
public class SharedDataComResourceAssociation extends SwCommunicationResourceAssociation {
    @objid ("086982cb-efef-46b2-8ddc-02c821b82098")
    public static final String STEREOTYPE_NAME = "SharedDataComResource_Association";

    @objid ("4d1d3fb7-87d1-47aa-b221-4802f0550efb")
    public static final String SHAREDDATACOMRESOURCE_ASSOCIATION_READSERVICES_TAGTYPE = "SharedDataComResource_Association_readServices";

    @objid ("9949261c-f668-4ddd-9ba7-1e50737cfdd8")
    public static final String SHAREDDATACOMRESOURCE_ASSOCIATION_WRITESERVICES_TAGTYPE = "SharedDataComResource_Association_writeServices";

    /**
     * Tells whether a {@link SharedDataComResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << SharedDataComResource_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("c726428c-d544-43f5-8e12-b1dbe11d4c25")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SharedDataComResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << SharedDataComResource_Association >> then instantiate a {@link SharedDataComResourceAssociation} proxy.
     * 
     * @return a {@link SharedDataComResourceAssociation} proxy on the created {@link Association}.
     */
    @objid ("9237ab6e-40c5-4a6a-9e26-063f41aedea0")
    public static SharedDataComResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SharedDataComResourceAssociation.STEREOTYPE_NAME);
        return SharedDataComResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link SharedDataComResourceAssociation} proxy from a {@link Association} stereotyped << SharedDataComResource_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link SharedDataComResourceAssociation} proxy or <i>null</i>.
     */
    @objid ("eb794b36-27eb-497c-8abb-8023834607a4")
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
    @objid ("8b8f74c4-7f3c-4dff-8fdd-ba83515365e2")
    public static SharedDataComResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (SharedDataComResourceAssociation.canInstantiate(obj))
        	return new SharedDataComResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("SharedDataComResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("35f19391-a0f8-4416-93ef-63c3aea14465")
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
    @objid ("eeb9b572-ef3d-42f7-8681-9b5fe9cb74d2")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for List<String> property 'SharedDataComResource_Association_readServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1d10f968-6b17-4c4e-877e-6f1706da049f")
    public List<String> getSharedDataComResource_Association_readServices() {
        return this.elt.getTagValues(SharedDataComResourceAssociation.MdaTypes.SHAREDDATACOMRESOURCE_ASSOCIATION_READSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SharedDataComResource_Association_writeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9bdb581d-57f4-44f9-95d9-3b434bbf13ed")
    public List<String> getSharedDataComResource_Association_writeServices() {
        return this.elt.getTagValues(SharedDataComResourceAssociation.MdaTypes.SHAREDDATACOMRESOURCE_ASSOCIATION_WRITESERVICES_TAGTYPE_ELT);
    }

    @objid ("62511acb-b69f-4f7f-bdb4-d17326a3ec8f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SharedDataComResource_Association_readServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("605e5885-0acf-49ed-aad0-fd87fb7cf556")
    public void setSharedDataComResource_Association_readServices(final List<String> values) {
        this.elt.putTagValues(SharedDataComResourceAssociation.MdaTypes.SHAREDDATACOMRESOURCE_ASSOCIATION_READSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SharedDataComResource_Association_writeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d86e7903-ad61-440c-9636-b05d2e31a3fd")
    public void setSharedDataComResource_Association_writeServices(final List<String> values) {
        this.elt.putTagValues(SharedDataComResourceAssociation.MdaTypes.SHAREDDATACOMRESOURCE_ASSOCIATION_WRITESERVICES_TAGTYPE_ELT, values);
    }

    @objid ("9abb9451-dd50-4929-8400-dacab1657464")
    protected SharedDataComResourceAssociation(final Association elt) {
        super(elt);
    }

    @objid ("84d19075-89c9-4fef-92e6-f14ab9e1709b")
    public static final class MdaTypes {
        @objid ("baf6486e-f770-4ffc-bdc9-dde3e61a3941")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("50913e4d-c469-4359-94c8-b3a2c585f14b")
        public static TagType SHAREDDATACOMRESOURCE_ASSOCIATION_READSERVICES_TAGTYPE_ELT;

        @objid ("de8c0538-3776-46ac-b925-b1bd8188281d")
        public static TagType SHAREDDATACOMRESOURCE_ASSOCIATION_WRITESERVICES_TAGTYPE_ELT;

        @objid ("f45c00f5-3760-4be1-adf5-db60b5a89e66")
        private static Stereotype MDAASSOCDEP;

        @objid ("04eb1b24-c0a4-490e-914e-05da2f1b90bf")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7ba1e321-ce9f-42b4-836b-12f26d4507e2")
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
