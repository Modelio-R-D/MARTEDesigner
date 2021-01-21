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
 * Proxy class to handle a {@link Parameter} with << ComputingResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("fc784a6b-df31-436f-ab5c-98a828e19fcd")
public class ComputingResourceParameter extends ProcessingResourceParameter {
    @objid ("9c657b3e-53c4-440a-862c-035d75d5f760")
    public static final String STEREOTYPE_NAME = "ComputingResource_Parameter";

    /**
     * Tells whether a {@link ComputingResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << ComputingResource_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("6bfcad4f-4f87-476a-b61f-90c67deb3295")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ComputingResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << ComputingResource_Parameter >> then instantiate a {@link ComputingResourceParameter} proxy.
     * 
     * @return a {@link ComputingResourceParameter} proxy on the created {@link Parameter}.
     */
    @objid ("24d3b851-0a7b-4493-bda8-05a90859c8e3")
    public static ComputingResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ComputingResourceParameter.STEREOTYPE_NAME);
        return ComputingResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link ComputingResourceParameter} proxy from a {@link Parameter} stereotyped << ComputingResource_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link ComputingResourceParameter} proxy or <i>null</i>.
     */
    @objid ("f0b6fb68-7bdf-4ca4-be1a-52c6d2ba3004")
    public static ComputingResourceParameter instantiate(final Parameter obj) {
        return ComputingResourceParameter.canInstantiate(obj) ? new ComputingResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ComputingResourceParameter} proxy from a {@link Parameter} stereotyped << ComputingResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link ComputingResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("23ac499b-e707-4d4a-b313-b2937ffb609c")
    public static ComputingResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (ComputingResourceParameter.canInstantiate(obj))
        	return new ComputingResourceParameter(obj);
        else
        	throw new IllegalArgumentException("ComputingResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("190ab2ec-135d-48fd-af8e-051aed1c14d0")
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
        ComputingResourceParameter other = (ComputingResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("6809aec4-7f21-4378-a431-8db9197ad40d")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    @objid ("5324b41c-24f3-4050-8c1e-ec6b62b7faec")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("288829bc-eff8-4b8b-9177-e7ec8f117270")
    protected ComputingResourceParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("1a6440c3-518d-4645-a330-f3e76e3e4baf")
    public static final class MdaTypes {
        @objid ("fbc2f4ee-39fb-4058-a4ff-11d7443b7430")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("12e9092c-a928-4820-86e1-05927fc5a2d0")
        private static Stereotype MDAASSOCDEP;

        @objid ("bebc6025-1f6a-4e36-b0c9-6b068205f666")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("658bf0d5-a09d-4061-beb9-98bca9b35270")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "009a84ce-0ccf-11df-8525-001302895b2b");
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
