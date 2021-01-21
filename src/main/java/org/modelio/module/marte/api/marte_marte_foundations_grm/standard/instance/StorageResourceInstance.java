/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << StorageResource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("a6313b49-2a90-4a12-850c-8030418eedbc")
public class StorageResourceInstance extends ResourceInstance {
    @objid ("ef11b6ca-4efc-4007-9339-00489b2d223e")
    public static final String STEREOTYPE_NAME = "StorageResource_Instance";

    @objid ("775bb1f5-9ef4-482b-b875-4dcb0f424a90")
    public static final String STORAGERESOURCE_INSTANCE_ELEMENTSIZE_TAGTYPE = "StorageResource_Instance_elementSize";

    /**
     * Tells whether a {@link StorageResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << StorageResource_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("20e3ef01-03e1-4c51-8a6e-5969c3289c45")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, StorageResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << StorageResource_Instance >> then instantiate a {@link StorageResourceInstance} proxy.
     * 
     * @return a {@link StorageResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("e2b7af8b-63ab-452a-b70d-574507f3b125")
    public static StorageResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, StorageResourceInstance.STEREOTYPE_NAME);
        return StorageResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link StorageResourceInstance} proxy from a {@link Instance} stereotyped << StorageResource_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link StorageResourceInstance} proxy or <i>null</i>.
     */
    @objid ("91f49752-6f39-4ac9-a39a-50f96a5a14ea")
    public static StorageResourceInstance instantiate(final Instance obj) {
        return StorageResourceInstance.canInstantiate(obj) ? new StorageResourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link StorageResourceInstance} proxy from a {@link Instance} stereotyped << StorageResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link StorageResourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("95997e97-938e-4d7d-8399-4a6d800a5ec0")
    public static StorageResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (StorageResourceInstance.canInstantiate(obj))
        	return new StorageResourceInstance(obj);
        else
        	throw new IllegalArgumentException("StorageResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c0cd1802-898b-48ca-a6b1-cbf042f6d386")
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
        StorageResourceInstance other = (StorageResourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("35ddb51c-82aa-4e21-b50c-9d4b53c82754")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'StorageResource_Instance_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("31fd0aae-fb5b-4fc6-b414-049b73662ca6")
    public String getStorageResource_Instance_elementSize() {
        return this.elt.getTagValue(StorageResourceInstance.MdaTypes.STORAGERESOURCE_INSTANCE_ELEMENTSIZE_TAGTYPE_ELT);
    }

    @objid ("1f180c9c-7e1f-4513-b9dc-84f7596f6709")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'StorageResource_Instance_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f3efb7b0-dabf-4211-a8de-50de0b6c9659")
    public void setStorageResource_Instance_elementSize(final String value) {
        this.elt.putTagValue(StorageResourceInstance.MdaTypes.STORAGERESOURCE_INSTANCE_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    @objid ("327ae342-695a-4af3-9473-21a2520229c2")
    protected StorageResourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("650c90b4-e1de-4803-a48b-b834c185f598")
    public static final class MdaTypes {
        @objid ("e7e41c44-ba40-41db-a8a4-b86c9404206a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("62da678b-6c2e-4122-8e19-d226df8a5cec")
        public static TagType STORAGERESOURCE_INSTANCE_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("1f799924-cd12-492c-b369-ce32cad275af")
        private static Stereotype MDAASSOCDEP;

        @objid ("3d878303-8926-4f22-8a61-e51a107d9a49")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("215d08e9-b5d7-419c-a01a-f94083b5ab12")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ffa29394-0cce-11df-8525-001302895b2b");
            STORAGERESOURCE_INSTANCE_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ffa4f5d5-0cce-11df-8525-001302895b2b");
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
