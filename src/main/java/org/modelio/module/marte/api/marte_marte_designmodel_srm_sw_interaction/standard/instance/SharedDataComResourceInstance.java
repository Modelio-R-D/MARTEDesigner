/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("9e00f1e6-0b40-49b7-9421-d67cfc7a66b3")
    public static final String STEREOTYPE_NAME = "SharedDataComResource_Instance";

    @objid ("df55ac90-68df-4c2b-a94c-33bce0b8d941")
    public static final String SHAREDDATACOMRESOURCE_INSTANCE_READSERVICES_TAGTYPE = "SharedDataComResource_Instance_readServices";

    @objid ("d15f2410-c438-42da-9575-1e789ac8f2d0")
    public static final String SHAREDDATACOMRESOURCE_INSTANCE_WRITESERVICES_TAGTYPE = "SharedDataComResource_Instance_writeServices";

    /**
     * Tells whether a {@link SharedDataComResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << SharedDataComResource_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2791fa33-6f59-44e5-9e21-6186e995531d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SharedDataComResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << SharedDataComResource_Instance >> then instantiate a {@link SharedDataComResourceInstance} proxy.
     * 
     * @return a {@link SharedDataComResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("b137b1dc-f87d-4d74-83e2-bed4af50dd8b")
    public static SharedDataComResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SharedDataComResourceInstance.STEREOTYPE_NAME);
        return SharedDataComResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link SharedDataComResourceInstance} proxy from a {@link Instance} stereotyped << SharedDataComResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link SharedDataComResourceInstance} proxy or <i>null</i>.
     */
    @objid ("e2ed6db4-18ed-494c-af46-eca077b8b06f")
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
    @objid ("29925185-4afb-4af5-9bd6-50631aae2de7")
    public static SharedDataComResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (SharedDataComResourceInstance.canInstantiate(obj))
        	return new SharedDataComResourceInstance(obj);
        else
        	throw new IllegalArgumentException("SharedDataComResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("05adf8d2-ddfd-48cc-a138-9378f22af2a4")
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
    @objid ("0ed633a5-33f7-4bd2-838b-7e73c5326351")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for List<String> property 'SharedDataComResource_Instance_readServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0bef4f05-1811-4883-921c-b98b8871701b")
    public List<String> getSharedDataComResource_Instance_readServices() {
        return this.elt.getTagValues(SharedDataComResourceInstance.MdaTypes.SHAREDDATACOMRESOURCE_INSTANCE_READSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SharedDataComResource_Instance_writeServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("44e1ab80-ff85-4206-be2e-b1b2cfe8c7a1")
    public List<String> getSharedDataComResource_Instance_writeServices() {
        return this.elt.getTagValues(SharedDataComResourceInstance.MdaTypes.SHAREDDATACOMRESOURCE_INSTANCE_WRITESERVICES_TAGTYPE_ELT);
    }

    @objid ("1fe7ac10-9eb0-4035-a974-6ce932f028f9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SharedDataComResource_Instance_readServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a8cb97b5-4620-4a97-91e5-c0a3441de098")
    public void setSharedDataComResource_Instance_readServices(final List<String> values) {
        this.elt.putTagValues(SharedDataComResourceInstance.MdaTypes.SHAREDDATACOMRESOURCE_INSTANCE_READSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SharedDataComResource_Instance_writeServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c4d2cfea-cc5e-407b-8e2b-fbe53817119c")
    public void setSharedDataComResource_Instance_writeServices(final List<String> values) {
        this.elt.putTagValues(SharedDataComResourceInstance.MdaTypes.SHAREDDATACOMRESOURCE_INSTANCE_WRITESERVICES_TAGTYPE_ELT, values);
    }

    @objid ("a5015810-aef1-4735-9791-d9012cbb8f16")
    protected SharedDataComResourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("6030a84e-f6c9-4627-b1b5-ab712979f2cc")
    public static final class MdaTypes {
        @objid ("d06a7110-2a14-4708-a16e-14d6a5c2283e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d9daf6a6-ebdd-46dd-a2dd-7290434db699")
        public static TagType SHAREDDATACOMRESOURCE_INSTANCE_READSERVICES_TAGTYPE_ELT;

        @objid ("2b1ba6a5-a658-4aaf-b8a8-acf6ca855d84")
        public static TagType SHAREDDATACOMRESOURCE_INSTANCE_WRITESERVICES_TAGTYPE_ELT;

        @objid ("c8616a4b-7b83-4356-b0a1-64fb315396d6")
        private static Stereotype MDAASSOCDEP;

        @objid ("108bd653-25cc-442a-a752-8095f31b0341")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1ae2fd30-c4a8-425d-be1c-478be8f8ce52")
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
