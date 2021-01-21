/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association;

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
 * Proxy class to handle a {@link Association} with << StorageResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("1ddf9b87-67a5-4b8d-b676-d696af031f02")
public class StorageResourceAssociation extends ResourceAssociation {
    @objid ("3ab6f82a-56ce-4ccb-87d2-66bdf0e54374")
    public static final String STEREOTYPE_NAME = "StorageResource_Association";

    @objid ("b54cc7f5-fbdf-4dd0-98a5-886d3e9f8e29")
    public static final String STORAGERESOURCE_ASSOCIATION_ELEMENTSIZE_TAGTYPE = "StorageResource_Association_elementSize";

    /**
     * Tells whether a {@link StorageResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << StorageResource_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("5554d59e-e3e1-49e8-b2ad-11461f094a45")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, StorageResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << StorageResource_Association >> then instantiate a {@link StorageResourceAssociation} proxy.
     * 
     * @return a {@link StorageResourceAssociation} proxy on the created {@link Association}.
     */
    @objid ("712bb2b6-e1e3-43da-b495-d1f29e209d41")
    public static StorageResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, StorageResourceAssociation.STEREOTYPE_NAME);
        return StorageResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link StorageResourceAssociation} proxy from a {@link Association} stereotyped << StorageResource_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link StorageResourceAssociation} proxy or <i>null</i>.
     */
    @objid ("73eaf2bb-1b85-4146-a468-c9d669c74db3")
    public static StorageResourceAssociation instantiate(final Association obj) {
        return StorageResourceAssociation.canInstantiate(obj) ? new StorageResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link StorageResourceAssociation} proxy from a {@link Association} stereotyped << StorageResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link StorageResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a9329729-1e70-4476-a43a-84e1a5377477")
    public static StorageResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (StorageResourceAssociation.canInstantiate(obj))
        	return new StorageResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("StorageResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c6dad912-46e4-44fe-a016-3d297207762b")
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
        StorageResourceAssociation other = (StorageResourceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("1e06acd6-096f-410c-84df-4875f9e14bc6")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'StorageResource_Association_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1c3fb557-b6f8-4d6c-b382-bf1b772b98db")
    public String getStorageResource_Association_elementSize() {
        return this.elt.getTagValue(StorageResourceAssociation.MdaTypes.STORAGERESOURCE_ASSOCIATION_ELEMENTSIZE_TAGTYPE_ELT);
    }

    @objid ("ffedb07a-9683-482f-8d84-64179aa23647")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'StorageResource_Association_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("be23eb95-3c9a-4ac3-9d76-3a6b5b018e80")
    public void setStorageResource_Association_elementSize(final String value) {
        this.elt.putTagValue(StorageResourceAssociation.MdaTypes.STORAGERESOURCE_ASSOCIATION_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    @objid ("004883de-5226-4eb3-a66f-fde47d3162db")
    protected StorageResourceAssociation(final Association elt) {
        super(elt);
    }

    @objid ("44bea9eb-fc51-47c1-a7d9-e2be49a48cf9")
    public static final class MdaTypes {
        @objid ("1c0f5a55-9e62-4829-bce5-4f6131ddeae3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c06cf0a7-1e37-48a1-96b7-02b18a3f1d3b")
        public static TagType STORAGERESOURCE_ASSOCIATION_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("a746beca-8a83-4654-b05d-b7041edea5c9")
        private static Stereotype MDAASSOCDEP;

        @objid ("d0b3e0c5-2226-488d-8f4f-0da7af314911")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("37ea8c52-687e-4d77-9d8d-b763166eaa86")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "bb2677eb-0f49-11df-8c52-0014222a9f79");
            STORAGERESOURCE_ASSOCIATION_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0d489a59-0f4a-11df-8c52-0014222a9f79");
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
