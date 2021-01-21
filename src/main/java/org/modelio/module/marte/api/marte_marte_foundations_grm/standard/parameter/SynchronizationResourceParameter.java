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
 * Proxy class to handle a {@link Parameter} with << SynchronizationResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("89fa907f-ef00-47fb-ab17-18e1bb4d0b76")
public class SynchronizationResourceParameter extends ResourceParameter {
    @objid ("ca71869d-e796-497c-aa9b-e0bd63b27869")
    public static final String STEREOTYPE_NAME = "SynchronizationResource_Parameter";

    /**
     * Tells whether a {@link SynchronizationResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << SynchronizationResource_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("0619e489-6810-41a8-9539-a28d6fc3062f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SynchronizationResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << SynchronizationResource_Parameter >> then instantiate a {@link SynchronizationResourceParameter} proxy.
     * 
     * @return a {@link SynchronizationResourceParameter} proxy on the created {@link Parameter}.
     */
    @objid ("a4e53780-89aa-40d5-b8b0-974e82783e4c")
    public static SynchronizationResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SynchronizationResourceParameter.STEREOTYPE_NAME);
        return SynchronizationResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link SynchronizationResourceParameter} proxy from a {@link Parameter} stereotyped << SynchronizationResource_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link SynchronizationResourceParameter} proxy or <i>null</i>.
     */
    @objid ("2863cbe6-a507-47de-8af2-a73462314585")
    public static SynchronizationResourceParameter instantiate(final Parameter obj) {
        return SynchronizationResourceParameter.canInstantiate(obj) ? new SynchronizationResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SynchronizationResourceParameter} proxy from a {@link Parameter} stereotyped << SynchronizationResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link SynchronizationResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f2b48667-f987-4bfd-886b-1a46580dce5f")
    public static SynchronizationResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (SynchronizationResourceParameter.canInstantiate(obj))
        	return new SynchronizationResourceParameter(obj);
        else
        	throw new IllegalArgumentException("SynchronizationResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c867641d-d41f-408b-8adc-c446028bf4e5")
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
        SynchronizationResourceParameter other = (SynchronizationResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("2a062ae4-5cba-4192-8627-6c63ed0eed9d")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    @objid ("58a01efd-58e2-4a56-8ec9-7b042e4ab382")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("0da4c0dc-a654-42ad-88bb-b98395f6e9a9")
    protected SynchronizationResourceParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("6ae5f76b-5d4e-48f3-9214-7cd4f435b41b")
    public static final class MdaTypes {
        @objid ("405b9eb6-70a3-43ec-bc5b-74a171d117d7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b046e51c-684c-48da-8453-e0e9c91faa80")
        private static Stereotype MDAASSOCDEP;

        @objid ("1b1e2611-4ab0-4c17-8f12-46d36a8d71af")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("76dc4fbe-b245-4ca7-9332-7dfe3d96b048")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ffa75828-0cce-11df-8525-001302895b2b");
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
