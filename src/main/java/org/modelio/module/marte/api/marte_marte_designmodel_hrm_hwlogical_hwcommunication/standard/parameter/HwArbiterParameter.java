/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.parameter;

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
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << HwArbiter_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("7d4d0ffc-d16c-4491-b4a6-3d413812c5d9")
public class HwArbiterParameter extends HwCommunicationResourceParameter {
    @objid ("bf46a125-6d1a-4318-90a4-25dd6a0f3329")
    public static final String STEREOTYPE_NAME = "HwArbiter_Parameter";

    @objid ("7e266aa4-6eb0-4ed3-8800-6ada666e448a")
    public static final String HWARBITER_PARAMETER_CONTROLLEDMEDIAS_TAGTYPE = "HwArbiter_Parameter_controlledMedias";

    /**
     * Tells whether a {@link HwArbiterParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwArbiter_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("3346ad0e-117d-4ff2-8315-42b7ed05eabc")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwArbiterParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwArbiter_Parameter >> then instantiate a {@link HwArbiterParameter} proxy.
     * 
     * @return a {@link HwArbiterParameter} proxy on the created {@link Parameter}.
     */
    @objid ("a0068c37-a4db-4481-b5bd-009b545e777d")
    public static HwArbiterParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwArbiterParameter.STEREOTYPE_NAME);
        return HwArbiterParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwArbiterParameter} proxy from a {@link Parameter} stereotyped << HwArbiter_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwArbiterParameter} proxy or <i>null</i>.
     */
    @objid ("cd0a56ed-3936-4cee-8653-2c18af266375")
    public static HwArbiterParameter instantiate(final Parameter obj) {
        return HwArbiterParameter.canInstantiate(obj) ? new HwArbiterParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwArbiterParameter} proxy from a {@link Parameter} stereotyped << HwArbiter_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwArbiterParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e19cd6e8-f8f7-4576-ba4c-863034bf8f3b")
    public static HwArbiterParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwArbiterParameter.canInstantiate(obj))
        	return new HwArbiterParameter(obj);
        else
        	throw new IllegalArgumentException("HwArbiterParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8047aae4-d705-485a-a417-2de282625ef9")
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
        HwArbiterParameter other = (HwArbiterParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("ced7c52c-1659-4ea5-87be-26555b172789")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwArbiter_Parameter_controlledMedias'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("45751c9e-e8e7-4591-a57f-2a780a569225")
    public List<String> getHwArbiter_Parameter_controlledMedias() {
        return this.elt.getTagValues(HwArbiterParameter.MdaTypes.HWARBITER_PARAMETER_CONTROLLEDMEDIAS_TAGTYPE_ELT);
    }

    @objid ("b04e3c86-0470-48ab-bc46-254ac9dd0df5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwArbiter_Parameter_controlledMedias'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("aaae74c5-62cd-4a6c-b15b-6337b89e78bc")
    public void setHwArbiter_Parameter_controlledMedias(final List<String> values) {
        this.elt.putTagValues(HwArbiterParameter.MdaTypes.HWARBITER_PARAMETER_CONTROLLEDMEDIAS_TAGTYPE_ELT, values);
    }

    @objid ("9c5ecdc2-bd4d-4c65-b779-3574db8e4d87")
    protected HwArbiterParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("e3e4ad41-8310-46d2-aeb8-f0650c934315")
    public static final class MdaTypes {
        @objid ("456033c4-bf37-435c-8631-9f433ff9437f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cd5b6f39-9573-4bd5-9f35-5355a58f801b")
        public static TagType HWARBITER_PARAMETER_CONTROLLEDMEDIAS_TAGTYPE_ELT;

        @objid ("56f1059e-537a-41e1-9b26-edc1a33ec222")
        private static Stereotype MDAASSOCDEP;

        @objid ("ddf977eb-9f21-44f2-8c9a-9be9b0ac1037")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9069c403-c44d-4ebf-81b0-61ffed323695")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00fea649-0ccf-11df-8525-001302895b2b");
            HWARBITER_PARAMETER_CONTROLLEDMEDIAS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01036aec-0ccf-11df-8525-001302895b2b");
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
