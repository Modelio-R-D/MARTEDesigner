/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter;

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
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << StorageResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("2b913365-197f-49e1-b4da-ae8e986b1dfd")
public class StorageResourceParameter extends ResourceParameter {
    @objid ("3db3e546-68c1-4b22-8e75-ae6b600bea9e")
    public static final String STEREOTYPE_NAME = "StorageResource_Parameter";

    @objid ("df84feff-93f6-42bc-9673-e325c1dabc47")
    public static final String STORAGERESOURCE_PARAMETER_ELEMENTSIZE_TAGTYPE = "StorageResource_Parameter_elementSize";

    /**
     * Tells whether a {@link StorageResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << StorageResource_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("33f9f107-2a45-47eb-8d2c-59f9101c5e2d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, StorageResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << StorageResource_Parameter >> then instantiate a {@link StorageResourceParameter} proxy.
     * 
     * @return a {@link StorageResourceParameter} proxy on the created {@link Parameter}.
     */
    @objid ("0e69f34e-4e2c-474d-b1ed-3a0f13ab94d5")
    public static StorageResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, StorageResourceParameter.STEREOTYPE_NAME);
        return StorageResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link StorageResourceParameter} proxy from a {@link Parameter} stereotyped << StorageResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link StorageResourceParameter} proxy or <i>null</i>.
     */
    @objid ("6fd1adb3-b9be-4b05-b7dc-a822062bcb87")
    public static StorageResourceParameter instantiate(final Parameter obj) {
        return StorageResourceParameter.canInstantiate(obj) ? new StorageResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link StorageResourceParameter} proxy from a {@link Parameter} stereotyped << StorageResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link StorageResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5512b6e9-d448-4ed2-b47b-ad11c21358be")
    public static StorageResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (StorageResourceParameter.canInstantiate(obj))
        	return new StorageResourceParameter(obj);
        else
        	throw new IllegalArgumentException("StorageResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("33e8f657-3bd8-434f-8147-7545a7dee4d8")
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
        StorageResourceParameter other = (StorageResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("fec47588-9c17-474b-a65d-32bb076831af")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'StorageResource_Parameter_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c5df6fce-fe9a-4046-8d8f-13d764c9456b")
    public String getStorageResource_Parameter_elementSize() {
        return this.elt.getTagValue(StorageResourceParameter.MdaTypes.STORAGERESOURCE_PARAMETER_ELEMENTSIZE_TAGTYPE_ELT);
    }

    @objid ("1e7ff41a-1c32-43ed-932c-a5eb34dc453c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'StorageResource_Parameter_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f720751d-a2f9-4cd1-92c1-22a63e292d32")
    public void setStorageResource_Parameter_elementSize(final String value) {
        this.elt.putTagValue(StorageResourceParameter.MdaTypes.STORAGERESOURCE_PARAMETER_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    @objid ("a070b018-9f6b-485d-b458-7f6f26ad2355")
    protected StorageResourceParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("84ad274d-d001-458b-960e-64857d877c15")
    public static final class MdaTypes {
        @objid ("1fe3edc9-3e46-4942-98ba-e0dae53d99d4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e40639a2-ee41-4941-9154-d5fd7d5d9fd4")
        public static TagType STORAGERESOURCE_PARAMETER_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("d94280ce-a63b-4407-bbe7-e351f4463ba9")
        private static Stereotype MDAASSOCDEP;

        @objid ("0ec7d7ba-1e1a-41bc-8750-c8ca77d4a32c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b4874078-26e6-433c-b777-3544a054f850")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "eb3f66e3-0f4b-11df-8c52-0014222a9f79");
            STORAGERESOURCE_PARAMETER_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "06268940-1576-11df-947b-001302895b2b");
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
