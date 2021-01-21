/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << StorageResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("02517595-5f62-455f-8415-2b7c20cc72b5")
public class StorageResourceAttribute extends ResourceAttribute {
    @objid ("94d0032b-3794-4e57-a376-65ddef606938")
    public static final String STEREOTYPE_NAME = "StorageResource_Attribute";

    @objid ("47d92d2c-9047-4b20-b81a-df57f0ba932a")
    public static final String STORAGERESOURCE_ATTRIBUTE_ELEMENTSIZE_TAGTYPE = "StorageResource_Attribute_elementSize";

    /**
     * Tells whether a {@link StorageResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << StorageResource_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("b23d5804-0a0c-4d42-9816-dfdb7719b6d8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, StorageResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << StorageResource_Attribute >> then instantiate a {@link StorageResourceAttribute} proxy.
     * 
     * @return a {@link StorageResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("00ad8de6-26a8-4976-92b4-23e505f60c8e")
    public static StorageResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, StorageResourceAttribute.STEREOTYPE_NAME);
        return StorageResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link StorageResourceAttribute} proxy from a {@link Attribute} stereotyped << StorageResource_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link StorageResourceAttribute} proxy or <i>null</i>.
     */
    @objid ("275922a5-06c7-47e2-90c3-6e57728d0730")
    public static StorageResourceAttribute instantiate(final Attribute obj) {
        return StorageResourceAttribute.canInstantiate(obj) ? new StorageResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link StorageResourceAttribute} proxy from a {@link Attribute} stereotyped << StorageResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link StorageResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("dfd76da1-e884-4451-8074-a0bccf26f49f")
    public static StorageResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (StorageResourceAttribute.canInstantiate(obj))
        	return new StorageResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("StorageResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("80519b8d-1df7-4b71-965a-4b727b4e0182")
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
        StorageResourceAttribute other = (StorageResourceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("7197acd3-f46c-4216-b4b8-05c64f0ef2a7")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'StorageResource_Attribute_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4d907efd-9966-4618-86e8-b01e9592cd4b")
    public String getStorageResource_Attribute_elementSize() {
        return this.elt.getTagValue(StorageResourceAttribute.MdaTypes.STORAGERESOURCE_ATTRIBUTE_ELEMENTSIZE_TAGTYPE_ELT);
    }

    @objid ("7319a34a-a6aa-4099-8fb9-17ef03d44fba")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'StorageResource_Attribute_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b7c72b23-1fa6-4080-b1a9-2a9abf898ea9")
    public void setStorageResource_Attribute_elementSize(final String value) {
        this.elt.putTagValue(StorageResourceAttribute.MdaTypes.STORAGERESOURCE_ATTRIBUTE_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    @objid ("3fdffec6-0af2-471b-893e-cf1a1e30fa37")
    protected StorageResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("fb406d2d-1904-46ff-a1c2-21fdcb44f08e")
    public static final class MdaTypes {
        @objid ("2633051c-4b9f-4b53-b664-dbfdbd24a236")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("977c2db3-9170-4dbf-8c59-da7d9f0e5234")
        public static TagType STORAGERESOURCE_ATTRIBUTE_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("572ed7ec-0620-45c3-bc0c-31beba0466ec")
        private static Stereotype MDAASSOCDEP;

        @objid ("0cb16f59-a55c-4da9-8d62-606f4b5f58f3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2f374a85-d6c2-489e-ab60-dc03df09b32d")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ffa29391-0cce-11df-8525-001302895b2b");
            STORAGERESOURCE_ATTRIBUTE_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ffa4f5d2-0cce-11df-8525-001302895b2b");
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
