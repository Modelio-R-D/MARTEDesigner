/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("2b8da775-8771-4a54-a198-3a849169d976")
    public static final String STEREOTYPE_NAME = "StorageResource_Instance";

    @objid ("13794ac6-4caf-4bfd-b2f2-0307d7644e27")
    public static final String STORAGERESOURCE_INSTANCE_ELEMENTSIZE_TAGTYPE = "StorageResource_Instance_elementSize";

    /**
     * Tells whether a {@link StorageResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << StorageResource_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9f100f8e-18aa-49a3-992b-892c7aa48ffa")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, StorageResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << StorageResource_Instance >> then instantiate a {@link StorageResourceInstance} proxy.
     * 
     * @return a {@link StorageResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("41afda18-cb50-408d-808f-7675636f0e85")
    public static StorageResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, StorageResourceInstance.STEREOTYPE_NAME);
        return StorageResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link StorageResourceInstance} proxy from a {@link Instance} stereotyped << StorageResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link StorageResourceInstance} proxy or <i>null</i>.
     */
    @objid ("82483a3e-bb57-4ada-8e81-212304336325")
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
    @objid ("370191b0-d650-4948-bf76-0d82293681c5")
    public static StorageResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (StorageResourceInstance.canInstantiate(obj))
        	return new StorageResourceInstance(obj);
        else
        	throw new IllegalArgumentException("StorageResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("70232b2b-b010-421c-87fe-f1d88f6a62fa")
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
    @objid ("f8f9486c-b6a5-4ec5-929c-1dd62f80687d")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'StorageResource_Instance_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6fb85ba5-e6a7-4cf0-a6da-799aa076d35f")
    public String getStorageResource_Instance_elementSize() {
        return this.elt.getTagValue(StorageResourceInstance.MdaTypes.STORAGERESOURCE_INSTANCE_ELEMENTSIZE_TAGTYPE_ELT);
    }

    @objid ("0241c9eb-f37e-4b54-a385-00e28b185ac7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'StorageResource_Instance_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3b3adff4-e867-4a20-be2a-50f44363a0c5")
    public void setStorageResource_Instance_elementSize(final String value) {
        this.elt.putTagValue(StorageResourceInstance.MdaTypes.STORAGERESOURCE_INSTANCE_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    @objid ("9640d270-bd50-46e9-875a-eb0c0a1951f3")
    protected StorageResourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("650c90b4-e1de-4803-a48b-b834c185f598")
    public static final class MdaTypes {
        @objid ("868a9586-2971-4ce4-8669-632649c9f173")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9a251ced-faeb-4c9f-afea-ca34b8816e2e")
        public static TagType STORAGERESOURCE_INSTANCE_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("b2714638-a7c2-4f12-98bc-59aeab7f8456")
        private static Stereotype MDAASSOCDEP;

        @objid ("41631e37-2c3b-43e6-be7b-1b3dcf16f97d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("641db928-e1de-4169-b34a-b1727f21e7fa")
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
