/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("531f30a6-7495-4160-b1b3-25eb46be751d")
    public static final String STEREOTYPE_NAME = "StorageResource_Parameter";

    @objid ("39e933f5-5ea8-4157-9698-4857517105a6")
    public static final String STORAGERESOURCE_PARAMETER_ELEMENTSIZE_TAGTYPE = "StorageResource_Parameter_elementSize";

    /**
     * Tells whether a {@link StorageResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << StorageResource_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("dcf946cf-ec77-44b1-a148-e9c51f7fe274")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, StorageResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << StorageResource_Parameter >> then instantiate a {@link StorageResourceParameter} proxy.
     * 
     * @return a {@link StorageResourceParameter} proxy on the created {@link Parameter}.
     */
    @objid ("af40e397-2492-498f-9e42-7cb17cfad682")
    public static StorageResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, StorageResourceParameter.STEREOTYPE_NAME);
        return StorageResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link StorageResourceParameter} proxy from a {@link Parameter} stereotyped << StorageResource_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link StorageResourceParameter} proxy or <i>null</i>.
     */
    @objid ("179a77f2-bfa6-4b1c-a722-35ed04da5d8e")
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
    @objid ("c7bb9a01-15fd-435f-8d08-95b433d6002e")
    public static StorageResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (StorageResourceParameter.canInstantiate(obj))
        	return new StorageResourceParameter(obj);
        else
        	throw new IllegalArgumentException("StorageResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8f2c2c6b-d887-459f-93be-2bc65fe64142")
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
    @objid ("1e2533f4-1a2c-452b-bbc4-a860cf4b251b")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'StorageResource_Parameter_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a2241d45-67dd-4a74-bb79-e622f87f9035")
    public String getStorageResource_Parameter_elementSize() {
        return this.elt.getTagValue(StorageResourceParameter.MdaTypes.STORAGERESOURCE_PARAMETER_ELEMENTSIZE_TAGTYPE_ELT);
    }

    @objid ("49665810-bee0-4e00-bf99-30a34e7bfb44")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'StorageResource_Parameter_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("da9c3477-4530-48d6-8dc6-0e6eb46acb0f")
    public void setStorageResource_Parameter_elementSize(final String value) {
        this.elt.putTagValue(StorageResourceParameter.MdaTypes.STORAGERESOURCE_PARAMETER_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    @objid ("2c682f31-ebd7-4c14-803e-6b0548ba1171")
    protected StorageResourceParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("84ad274d-d001-458b-960e-64857d877c15")
    public static final class MdaTypes {
        @objid ("ad471ce6-ccf4-4b15-871b-ebb1123f360e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2c130b11-7f85-4da4-a3b9-e5645412fcc8")
        public static TagType STORAGERESOURCE_PARAMETER_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("3c456776-6124-4c77-a142-4c095f1abf73")
        private static Stereotype MDAASSOCDEP;

        @objid ("ed93b977-4735-4823-b5e7-ab92e7a065e5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0109ed70-da04-4e94-891b-04d1eef2555b")
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
