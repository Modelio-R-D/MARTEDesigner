/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter;

import java.util.ArrayList;
import java.util.Collections;
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
public class StorageResourceParameter extends ResourceParameter {
    public static final String STEREOTYPE_NAME = "StorageResource_Parameter";

    public static final String STORAGERESOURCE_PARAMETER_ELEMENTSIZE_TAGTYPE = "StorageResource_Parameter_elementSize";

    /**
     * Tells whether a {@link StorageResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << StorageResource_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, StorageResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << StorageResource_Parameter >> then instantiate a {@link StorageResourceParameter} proxy.
     * 
     * @return a {@link StorageResourceParameter} proxy on the created {@link Parameter}.
     */
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
    public static StorageResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (StorageResourceParameter.canInstantiate(obj))
        	return new StorageResourceParameter(obj);
        else
        	throw new IllegalArgumentException("StorageResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        StorageResourceParameter other = (StorageResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'StorageResource_Parameter_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getStorageResource_Parameter_elementSize() {
        return this.elt.getTagValue(StorageResourceParameter.MdaTypes.STORAGERESOURCE_PARAMETER_ELEMENTSIZE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'StorageResource_Parameter_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setStorageResource_Parameter_elementSize(final String value) {
        this.elt.putTagValue(StorageResourceParameter.MdaTypes.STORAGERESOURCE_PARAMETER_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    protected StorageResourceParameter(final Parameter elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType STORAGERESOURCE_PARAMETER_ELEMENTSIZE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
