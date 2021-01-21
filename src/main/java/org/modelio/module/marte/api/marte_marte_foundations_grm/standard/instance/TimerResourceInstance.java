/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << TimerResource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("677871d4-fc92-468e-80e0-7dc7e22d3fc0")
public class TimerResourceInstance extends TimingResourceInstance {
    @objid ("a30a9ca8-01ca-41b2-aff0-e71086d7e2bb")
    public static final String STEREOTYPE_NAME = "TimerResource_Instance";

    @objid ("da27a1b0-4863-45fc-ac8d-694eff6d1fdd")
    public static final String TIMERRESOURCE_INSTANCE_DURATION_TAGTYPE = "TimerResource_Instance_duration";

    @objid ("9ac88fa3-e35f-41a8-8edb-bc0cf921c318")
    public static final String TIMERRESOURCE_INSTANCE_ISPERIODIC_TAGTYPE = "TimerResource_Instance_isPeriodic";

    /**
     * Tells whether a {@link TimerResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << TimerResource_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("a961bb02-5b88-473f-a473-507456f490ca")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimerResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << TimerResource_Instance >> then instantiate a {@link TimerResourceInstance} proxy.
     * 
     * @return a {@link TimerResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("f86328db-1972-4417-8caa-046f3c53ac6d")
    public static TimerResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimerResourceInstance.STEREOTYPE_NAME);
        return TimerResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link TimerResourceInstance} proxy from a {@link Instance} stereotyped << TimerResource_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link TimerResourceInstance} proxy or <i>null</i>.
     */
    @objid ("9a9b8ae2-4610-4d01-a411-8fb3da03e987")
    public static TimerResourceInstance instantiate(final Instance obj) {
        return TimerResourceInstance.canInstantiate(obj) ? new TimerResourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TimerResourceInstance} proxy from a {@link Instance} stereotyped << TimerResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link TimerResourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2f11bbeb-7613-4273-8d95-2c6a9ee830a3")
    public static TimerResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (TimerResourceInstance.canInstantiate(obj))
        	return new TimerResourceInstance(obj);
        else
        	throw new IllegalArgumentException("TimerResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c11f14b7-647c-462c-932c-4832911c8caf")
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
        TimerResourceInstance other = (TimerResourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("3752b53d-8f7c-4c1e-b27c-b07b3e7f7ffb")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'TimerResource_Instance_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e1112dc1-bf0e-448a-a1de-fbbfd5dc4084")
    public String getTimerResource_Instance_duration() {
        return this.elt.getTagValue(TimerResourceInstance.MdaTypes.TIMERRESOURCE_INSTANCE_DURATION_TAGTYPE_ELT);
    }

    @objid ("416564d2-c97f-4b0d-8dc3-d36dd384d119")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'TimerResource_Instance_isPeriodic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d8f71a0c-c6b2-4177-adaa-39cfdbb9c89f")
    public boolean isTimerResource_Instance_isPeriodic() {
        return this.elt.isTagged(TimerResourceInstance.MdaTypes.TIMERRESOURCE_INSTANCE_ISPERIODIC_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'TimerResource_Instance_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4eca650c-6434-4dd0-befe-4b98813fa5c9")
    public void setTimerResource_Instance_duration(final String value) {
        this.elt.putTagValue(TimerResourceInstance.MdaTypes.TIMERRESOURCE_INSTANCE_DURATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'TimerResource_Instance_isPeriodic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7dcb6461-4a20-423e-ad65-68eb8eeb6667")
    public void setTimerResource_Instance_isPeriodic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(TimerResourceInstance.MdaTypes.TIMERRESOURCE_INSTANCE_ISPERIODIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(TimerResourceInstance.MdaTypes.TIMERRESOURCE_INSTANCE_ISPERIODIC_TAGTYPE_ELT);
    }

    @objid ("32ebfd31-3e81-4dd5-afef-6ce30a9c5972")
    protected TimerResourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("9ab73002-34f5-4039-ae2f-56401306753b")
    public static final class MdaTypes {
        @objid ("eb20ab64-33c7-4a9d-9947-2ccd9baff19a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("189b730e-4fb9-4ac1-97d6-4302cae79931")
        public static TagType TIMERRESOURCE_INSTANCE_DURATION_TAGTYPE_ELT;

        @objid ("f64620f9-009d-4263-ab11-f4c5371db1b2")
        public static TagType TIMERRESOURCE_INSTANCE_ISPERIODIC_TAGTYPE_ELT;

        @objid ("3bfcd744-4c0e-4c71-8d62-a7cb0a364edf")
        private static Stereotype MDAASSOCDEP;

        @objid ("c9d44db1-4c11-42be-adaf-24a2d976a2fd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2f8c68cc-a2f2-4a1c-991b-ea3a12a81e66")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00a1abc9-0ccf-11df-8525-001302895b2b");
            TIMERRESOURCE_INSTANCE_DURATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00a1abd0-0ccf-11df-8525-001302895b2b");
            TIMERRESOURCE_INSTANCE_ISPERIODIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00a1abd7-0ccf-11df-8525-001302895b2b");
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
