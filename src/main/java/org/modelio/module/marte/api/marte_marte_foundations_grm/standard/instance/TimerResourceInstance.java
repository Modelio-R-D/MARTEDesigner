/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("5b574eb7-3db4-4ab9-92b0-e1c574ee8ed4")
    public static final String STEREOTYPE_NAME = "TimerResource_Instance";

    @objid ("33f48132-5401-4131-a9b4-06559cd3d4d4")
    public static final String TIMERRESOURCE_INSTANCE_DURATION_TAGTYPE = "TimerResource_Instance_duration";

    @objid ("590f2c99-afa6-49e7-8a23-fbb19d7fda51")
    public static final String TIMERRESOURCE_INSTANCE_ISPERIODIC_TAGTYPE = "TimerResource_Instance_isPeriodic";

    /**
     * Tells whether a {@link TimerResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << TimerResource_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("485473ba-b25a-4803-aaf9-4c60cc1b8fec")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimerResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << TimerResource_Instance >> then instantiate a {@link TimerResourceInstance} proxy.
     * 
     * @return a {@link TimerResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("79c5b4c6-01f5-4102-875a-253a354b9012")
    public static TimerResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimerResourceInstance.STEREOTYPE_NAME);
        return TimerResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link TimerResourceInstance} proxy from a {@link Instance} stereotyped << TimerResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link TimerResourceInstance} proxy or <i>null</i>.
     */
    @objid ("7078ec27-481c-4f51-9d8b-f7acfe342bf1")
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
    @objid ("82a13ef1-9a2e-463c-b29a-bdf27b503440")
    public static TimerResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (TimerResourceInstance.canInstantiate(obj))
        	return new TimerResourceInstance(obj);
        else
        	throw new IllegalArgumentException("TimerResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3fbd62bb-10a9-44ef-822b-5d40fa6c9dd8")
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
    @objid ("46b19b8d-d20d-427b-a8e3-3337bfaa9f24")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'TimerResource_Instance_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e9cc0cf9-e89f-4bb5-9435-6d1dc3ef0015")
    public String getTimerResource_Instance_duration() {
        return this.elt.getTagValue(TimerResourceInstance.MdaTypes.TIMERRESOURCE_INSTANCE_DURATION_TAGTYPE_ELT);
    }

    @objid ("9a97b61c-983e-4952-8391-13c9271b5b36")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'TimerResource_Instance_isPeriodic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("aa714bdd-24f3-4100-abb4-d15c36eaeddd")
    public boolean isTimerResource_Instance_isPeriodic() {
        return this.elt.isTagged(TimerResourceInstance.MdaTypes.TIMERRESOURCE_INSTANCE_ISPERIODIC_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'TimerResource_Instance_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fff271a8-e427-4a51-810b-e9e412d2c837")
    public void setTimerResource_Instance_duration(final String value) {
        this.elt.putTagValue(TimerResourceInstance.MdaTypes.TIMERRESOURCE_INSTANCE_DURATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'TimerResource_Instance_isPeriodic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("81be4911-54a9-4ca0-bfe8-609bc2497ea7")
    public void setTimerResource_Instance_isPeriodic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(TimerResourceInstance.MdaTypes.TIMERRESOURCE_INSTANCE_ISPERIODIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(TimerResourceInstance.MdaTypes.TIMERRESOURCE_INSTANCE_ISPERIODIC_TAGTYPE_ELT);
    }

    @objid ("5aaf66f2-bf02-436f-a2b0-5b82867963c0")
    protected TimerResourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("9ab73002-34f5-4039-ae2f-56401306753b")
    public static final class MdaTypes {
        @objid ("b79514ee-7049-4d6a-b260-5d9591ff3db5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("543c4378-396e-4fe6-8dd1-aea9810ccdb5")
        public static TagType TIMERRESOURCE_INSTANCE_DURATION_TAGTYPE_ELT;

        @objid ("fad80424-6f10-47c9-99c6-755a107d17b4")
        public static TagType TIMERRESOURCE_INSTANCE_ISPERIODIC_TAGTYPE_ELT;

        @objid ("6ed53890-e790-4c60-af78-a9492d372eb2")
        private static Stereotype MDAASSOCDEP;

        @objid ("b5492f8b-6ab1-4dd0-b082-f80d4d4f6b50")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7a2432a9-d370-4fef-a9e0-4fda15ead80f")
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
