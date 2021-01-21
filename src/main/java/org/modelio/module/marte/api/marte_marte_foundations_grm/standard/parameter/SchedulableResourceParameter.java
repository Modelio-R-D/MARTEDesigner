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
 * Proxy class to handle a {@link Parameter} with << SchedulableResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("956c4698-0fbd-4038-9954-fe8954bf64dd")
public class SchedulableResourceParameter extends ResourceParameter {
    @objid ("6c62fa4a-ee2e-49e0-bd95-46f564614506")
    public static final String STEREOTYPE_NAME = "SchedulableResource_Parameter";

    @objid ("6798a0e7-7019-4027-a448-b015f3895aed")
    public static final String SCHEDULABLERESOURCE_PARAMETER_DEPENDENTSCHEDULER_TAGTYPE = "SchedulableResource_Parameter_dependentScheduler";

    @objid ("b9d33ca0-089b-417a-8092-6ae2225424bd")
    public static final String SCHEDULABLERESOURCE_PARAMETER_HOST_TAGTYPE = "SchedulableResource_Parameter_host";

    @objid ("feae7010-c72a-4f88-971a-8ba85692b368")
    public static final String SCHEDULABLERESOURCE_PARAMETER_SCHEDPARAMS_TAGTYPE = "SchedulableResource_Parameter_schedParams";

    /**
     * Tells whether a {@link SchedulableResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << SchedulableResource_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("8b9b458f-ae1d-41eb-ad31-633a397d1535")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SchedulableResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << SchedulableResource_Parameter >> then instantiate a {@link SchedulableResourceParameter} proxy.
     * 
     * @return a {@link SchedulableResourceParameter} proxy on the created {@link Parameter}.
     */
    @objid ("f0722c4a-9686-4dd0-91e4-e827459f461c")
    public static SchedulableResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SchedulableResourceParameter.STEREOTYPE_NAME);
        return SchedulableResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link SchedulableResourceParameter} proxy from a {@link Parameter} stereotyped << SchedulableResource_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link SchedulableResourceParameter} proxy or <i>null</i>.
     */
    @objid ("4c6f5853-2e00-49b2-b1e2-fac6f759b20b")
    public static SchedulableResourceParameter instantiate(final Parameter obj) {
        return SchedulableResourceParameter.canInstantiate(obj) ? new SchedulableResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SchedulableResourceParameter} proxy from a {@link Parameter} stereotyped << SchedulableResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link SchedulableResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("63544e8a-a9ab-4950-9445-5689f6d89bf9")
    public static SchedulableResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (SchedulableResourceParameter.canInstantiate(obj))
        	return new SchedulableResourceParameter(obj);
        else
        	throw new IllegalArgumentException("SchedulableResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b93f63a8-ee4a-4882-9f18-0fab811d427a")
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
        SchedulableResourceParameter other = (SchedulableResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("400262e5-a5aa-4a5a-8ad7-26432b46af73")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'SchedulableResource_Parameter_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("47b82ae8-ad7d-4daa-9115-f9cbfa166c2d")
    public String getSchedulableResource_Parameter_dependentScheduler() {
        return this.elt.getTagValue(SchedulableResourceParameter.MdaTypes.SCHEDULABLERESOURCE_PARAMETER_DEPENDENTSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SchedulableResource_Parameter_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6b25ade7-bc17-421a-a493-d81449cf04d4")
    public String getSchedulableResource_Parameter_host() {
        return this.elt.getTagValue(SchedulableResourceParameter.MdaTypes.SCHEDULABLERESOURCE_PARAMETER_HOST_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SchedulableResource_Parameter_schedParams'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b0bd7c1c-7663-44eb-a815-6e55114ddf03")
    public List<String> getSchedulableResource_Parameter_schedParams() {
        return this.elt.getTagValues(SchedulableResourceParameter.MdaTypes.SCHEDULABLERESOURCE_PARAMETER_SCHEDPARAMS_TAGTYPE_ELT);
    }

    @objid ("ce6d1a6b-487a-49b5-b974-dfafc7139e49")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'SchedulableResource_Parameter_dependentScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("08e9af94-abdd-43f2-b7d9-fe40b0b1efc8")
    public void setSchedulableResource_Parameter_dependentScheduler(final String value) {
        this.elt.putTagValue(SchedulableResourceParameter.MdaTypes.SCHEDULABLERESOURCE_PARAMETER_DEPENDENTSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SchedulableResource_Parameter_host'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8b3a8634-b16b-4f63-bece-50ac0826d5da")
    public void setSchedulableResource_Parameter_host(final String value) {
        this.elt.putTagValue(SchedulableResourceParameter.MdaTypes.SCHEDULABLERESOURCE_PARAMETER_HOST_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SchedulableResource_Parameter_schedParams'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e0fa6352-cfcc-4da9-a1cd-d07596fa526d")
    public void setSchedulableResource_Parameter_schedParams(final List<String> values) {
        this.elt.putTagValues(SchedulableResourceParameter.MdaTypes.SCHEDULABLERESOURCE_PARAMETER_SCHEDPARAMS_TAGTYPE_ELT, values);
    }

    @objid ("481c7eeb-8273-4844-afba-677f0dde58d4")
    protected SchedulableResourceParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("5c993ae0-fb75-4794-92a3-18aaa825bad6")
    public static final class MdaTypes {
        @objid ("b4b9991f-1a5e-4eba-b195-f2af7a32d56c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6a605d9c-baa0-4bad-b662-92dc5136f427")
        public static TagType SCHEDULABLERESOURCE_PARAMETER_SCHEDPARAMS_TAGTYPE_ELT;

        @objid ("56514d24-dde3-41d8-be51-dcd369f7937d")
        public static TagType SCHEDULABLERESOURCE_PARAMETER_HOST_TAGTYPE_ELT;

        @objid ("20b02e44-6bf0-4a0e-bf71-6e910e33027b")
        public static TagType SCHEDULABLERESOURCE_PARAMETER_DEPENDENTSCHEDULER_TAGTYPE_ELT;

        @objid ("f0445459-5918-464b-a159-ba3524c9b35d")
        private static Stereotype MDAASSOCDEP;

        @objid ("1382abb3-18e8-4275-a6f4-6ba1ac64c8d7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("92fd0e29-1172-4bec-ba16-c20b1a45c9e8")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "008c36e2-0ccf-11df-8525-001302895b2b");
            SCHEDULABLERESOURCE_PARAMETER_SCHEDPARAMS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "008e993a-0ccf-11df-8525-001302895b2b");
            SCHEDULABLERESOURCE_PARAMETER_HOST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0090fb8b-0ccf-11df-8525-001302895b2b");
            SCHEDULABLERESOURCE_PARAMETER_DEPENDENTSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0090fb92-0ccf-11df-8525-001302895b2b");
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
