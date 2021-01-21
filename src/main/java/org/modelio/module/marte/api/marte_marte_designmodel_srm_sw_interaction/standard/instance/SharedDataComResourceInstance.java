/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << SharedDataComResource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("a2368ecb-5f7f-411d-aea9-6273d00de4d0")
public class SharedDataComResourceInstance extends SwCommunicationResourceInstance {
    @objid ("cb7569e4-e242-432a-af91-354110d9b801")
    public static final String STEREOTYPE_NAME = "SharedDataComResource_Instance";

    @objid ("8dc62278-b229-4a30-aba6-26448a21e36b")
    public static final String SHAREDDATACOMRESOURCE_INSTANCE_READSERVICES_TAGTYPE = "SharedDataComResource_Instance_readServices";

    @objid ("a53d1eb7-d52e-4ee6-acd5-9645d84714d6")
    public static final String SHAREDDATACOMRESOURCE_INSTANCE_WRITESERVICES_TAGTYPE = "SharedDataComResource_Instance_writeServices";

    /**
     * Tells whether a {@link SharedDataComResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << SharedDataComResource_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("9e152c91-9ada-454a-8205-872f91cf6d2e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SharedDataComResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << SharedDataComResource_Instance >> then instantiate a {@link SharedDataComResourceInstance} proxy.
     * 
     * @return a {@link SharedDataComResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("2ff96385-071e-44fc-8ef6-6c18200b404c")
    public static SharedDataComResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SharedDataComResourceInstance.STEREOTYPE_NAME);
        return SharedDataComResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link SharedDataComResourceInstance} proxy from a {@link Instance} stereotyped << SharedDataComResource_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link SharedDataComResourceInstance} proxy or <i>null</i>.
     */
    @objid ("10e79975-106b-45bd-a7e5-c9c1db98c2e8")
    public static SharedDataComResourceInstance instantiate(final Instance obj) {
        return SharedDataComResourceInstance.canInstantiate(obj) ? new SharedDataComResourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SharedDataComResourceInstance} proxy from a {@link Instance} stereotyped << SharedDataComResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link SharedDataComResourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a927e8d1-98ea-41f3-95c6-609d8f3e7893")
    public static SharedDataComResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (SharedDataComResourceInstance.canInstantiate(obj))
        	return new SharedDataComResourceInstance(obj);
        else
        	throw new IllegalArgumentException("SharedDataComResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("895739ad-bd2d-46ec-957d-fb3e3efec269")
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
        SharedDataComResourceInstance other = (SharedDataComResourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("061d5fe4-51d0-46b6-b98f-8da1f20e70d1")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for List<String> property 'SharedDataComResource_Instance_readServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("296ccdc5-8926-4e8d-8509-edd9478c52dd")
    public List<String> getSharedDataComResource_Instance_readServices() {
        return this.elt.getTagValues(SharedDataComResourceInstance.MdaTypes.SHAREDDATACOMRESOURCE_INSTANCE_READSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SharedDataComResource_Instance_writeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("49c69e25-232d-4319-b72b-66f8da113648")
    public List<String> getSharedDataComResource_Instance_writeServices() {
        return this.elt.getTagValues(SharedDataComResourceInstance.MdaTypes.SHAREDDATACOMRESOURCE_INSTANCE_WRITESERVICES_TAGTYPE_ELT);
    }

    @objid ("bf1f5118-110c-4c30-9e38-b03cc644a37c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SharedDataComResource_Instance_readServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5c4d8980-0818-4150-8564-9d92268aca57")
    public void setSharedDataComResource_Instance_readServices(final List<String> values) {
        this.elt.putTagValues(SharedDataComResourceInstance.MdaTypes.SHAREDDATACOMRESOURCE_INSTANCE_READSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SharedDataComResource_Instance_writeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1e65d15c-f90c-4781-aa08-12f7d0dd40a4")
    public void setSharedDataComResource_Instance_writeServices(final List<String> values) {
        this.elt.putTagValues(SharedDataComResourceInstance.MdaTypes.SHAREDDATACOMRESOURCE_INSTANCE_WRITESERVICES_TAGTYPE_ELT, values);
    }

    @objid ("7a15dbba-2370-43d6-80c0-86cf212ed503")
    protected SharedDataComResourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("6030a84e-f6c9-4627-b1b5-ab712979f2cc")
    public static final class MdaTypes {
        @objid ("4a00a165-bd39-434d-a038-8150da704df8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0629806d-d1a4-48d7-a73d-2b9e0179506d")
        public static TagType SHAREDDATACOMRESOURCE_INSTANCE_READSERVICES_TAGTYPE_ELT;

        @objid ("dbbafe81-a13e-45d0-a756-f58da6565231")
        public static TagType SHAREDDATACOMRESOURCE_INSTANCE_WRITESERVICES_TAGTYPE_ELT;

        @objid ("44c4b8cf-5864-4190-97a7-52ad06d4f184")
        private static Stereotype MDAASSOCDEP;

        @objid ("8bfdaef3-37bf-4c89-bcd0-0fb460b8b19c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("262ed125-202e-4fc4-9b04-14a76ee1962c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0221815b-0ccf-11df-8525-001302895b2b");
            SHAREDDATACOMRESOURCE_INSTANCE_READSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02218162-0ccf-11df-8525-001302895b2b");
            SHAREDDATACOMRESOURCE_INSTANCE_WRITESERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02218169-0ccf-11df-8525-001302895b2b");
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
