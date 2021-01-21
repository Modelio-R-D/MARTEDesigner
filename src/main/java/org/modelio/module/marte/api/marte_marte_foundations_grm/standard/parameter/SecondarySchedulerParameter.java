/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter;

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
 * Proxy class to handle a {@link Parameter} with << SecondaryScheduler_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("0663fdf7-776d-46fb-96dc-5b5f861bf76d")
public class SecondarySchedulerParameter extends SchedulerParameter {
    @objid ("f9aa39b9-c717-4d1f-a365-ea78857a64c7")
    public static final String STEREOTYPE_NAME = "SecondaryScheduler_Parameter";

    @objid ("03167c80-754e-4c0a-a47e-ac43db904659")
    public static final String SECONDARYSCHEDULER_PARAMETER_VIRTUALPROCESSINGUNITS_TAGTYPE = "SecondaryScheduler_Parameter_virtualProcessingUnits";

    /**
     * Tells whether a {@link SecondarySchedulerParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << SecondaryScheduler_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("216c25b5-1759-4d68-8614-95476abffe48")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SecondarySchedulerParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << SecondaryScheduler_Parameter >> then instantiate a {@link SecondarySchedulerParameter} proxy.
     * 
     * @return a {@link SecondarySchedulerParameter} proxy on the created {@link Parameter}.
     */
    @objid ("5584db1c-d92f-4995-9a30-828b7740cb01")
    public static SecondarySchedulerParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SecondarySchedulerParameter.STEREOTYPE_NAME);
        return SecondarySchedulerParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link SecondarySchedulerParameter} proxy from a {@link Parameter} stereotyped << SecondaryScheduler_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link SecondarySchedulerParameter} proxy or <i>null</i>.
     */
    @objid ("f567fccc-d3a2-43fb-a7af-bcc85fd0daf4")
    public static SecondarySchedulerParameter instantiate(final Parameter obj) {
        return SecondarySchedulerParameter.canInstantiate(obj) ? new SecondarySchedulerParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SecondarySchedulerParameter} proxy from a {@link Parameter} stereotyped << SecondaryScheduler_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link SecondarySchedulerParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6918ef8f-5d82-4824-8bfb-cb4c79741676")
    public static SecondarySchedulerParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (SecondarySchedulerParameter.canInstantiate(obj))
        	return new SecondarySchedulerParameter(obj);
        else
        	throw new IllegalArgumentException("SecondarySchedulerParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1770dcde-dd81-482a-b5d1-cb9227d594f2")
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
        SecondarySchedulerParameter other = (SecondarySchedulerParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("f2d0886e-e6f0-489f-99ab-8648ea75c9d4")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for List<String> property 'SecondaryScheduler_Parameter_virtualProcessingUnits'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("2070caf9-4fa4-4b05-ae6c-894dc9f05e07")
    public List<String> getSecondaryScheduler_Parameter_virtualProcessingUnits() {
        return this.elt.getTagValues(SecondarySchedulerParameter.MdaTypes.SECONDARYSCHEDULER_PARAMETER_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT);
    }

    @objid ("c3917e2b-d806-4ef8-9e42-ca16a501e5bf")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SecondaryScheduler_Parameter_virtualProcessingUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e88b0be1-b01e-4629-9584-8a05dd7e0362")
    public void setSecondaryScheduler_Parameter_virtualProcessingUnits(final List<String> values) {
        this.elt.putTagValues(SecondarySchedulerParameter.MdaTypes.SECONDARYSCHEDULER_PARAMETER_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT, values);
    }

    @objid ("6e4c8ee8-e92e-446d-8ace-be0488dda2ec")
    protected SecondarySchedulerParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("dfef9200-e762-436c-ae1e-dc320c3047da")
    public static final class MdaTypes {
        @objid ("52d19003-c8e5-4022-ae5c-e40390fb4344")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2b8bbd10-7106-4efc-be77-3ce962a97968")
        public static TagType SECONDARYSCHEDULER_PARAMETER_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT;

        @objid ("f11f2c63-8c05-45a5-a79d-e2e14160dbda")
        private static Stereotype MDAASSOCDEP;

        @objid ("d1e23e99-448f-4107-a07a-b72cac3e3261")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("08aec882-d5d5-4486-a2ee-7cc14483d069")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "789278b2-0f41-11df-8c52-0014222a9f79");
            SECONDARYSCHEDULER_PARAMETER_VIRTUALPROCESSINGUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "74dd8f07-16fa-11df-b92a-0014222a9f79");
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
