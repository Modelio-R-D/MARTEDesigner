/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.parameter;

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
 * Proxy class to handle a {@link Parameter} with << HwActuator_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d22356eb-f212-4b4b-b30d-fbbc6072d602")
public class HwActuatorParameter extends HwIOParameter {
    @objid ("d6222bee-612d-4d8d-b0fe-e7124fc0205f")
    public static final String STEREOTYPE_NAME = "HwActuator_Parameter";

    /**
     * Tells whether a {@link HwActuatorParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwActuator_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2b22fd18-ce85-4497-ad3a-02857906f24b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwActuatorParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwActuator_Parameter >> then instantiate a {@link HwActuatorParameter} proxy.
     * 
     * @return a {@link HwActuatorParameter} proxy on the created {@link Parameter}.
     */
    @objid ("6fc8b93f-8e12-4256-88f1-b3f97d7922b6")
    public static HwActuatorParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwActuatorParameter.STEREOTYPE_NAME);
        return HwActuatorParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwActuatorParameter} proxy from a {@link Parameter} stereotyped << HwActuator_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwActuatorParameter} proxy or <i>null</i>.
     */
    @objid ("dd4b5c1d-47a5-4f0d-8955-89456f2c387c")
    public static HwActuatorParameter instantiate(final Parameter obj) {
        return HwActuatorParameter.canInstantiate(obj) ? new HwActuatorParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwActuatorParameter} proxy from a {@link Parameter} stereotyped << HwActuator_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwActuatorParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("78f2dcbd-9ecd-401a-85ab-59123d7df1f7")
    public static HwActuatorParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwActuatorParameter.canInstantiate(obj))
        	return new HwActuatorParameter(obj);
        else
        	throw new IllegalArgumentException("HwActuatorParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("70809988-348c-43b3-a87c-2f88763918e9")
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
        HwActuatorParameter other = (HwActuatorParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("65b1152b-52ef-4b51-bb59-928ade0c94e7")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    @objid ("399e75cf-8d14-4a3a-b56b-6e82ac02e51e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("5fe504b2-6046-4812-845d-311737d6c43e")
    protected HwActuatorParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("73d59287-23a3-40ef-897e-817c49c6856e")
    public static final class MdaTypes {
        @objid ("801ff9c7-7a60-4b2a-95bd-badad4397845")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8db85484-a761-4302-9a5b-98b650c3312b")
        private static Stereotype MDAASSOCDEP;

        @objid ("29eec5ce-49e4-4188-94ea-ed9cc8ea3e48")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8f371f78-7db2-4e8b-9c17-d53d8f1e6b55")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "88a37416-c7ac-11df-ad39-001302895b2b");
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
