/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << Alarm_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("906efce6-89a5-455a-b639-489cc6e30960")
public class AlarmInstance extends InterruptResourceInstance {
    @objid ("550caac0-977b-43c5-83a4-9bde4c6583cc")
    public static final String STEREOTYPE_NAME = "Alarm_Instance";

    @objid ("7dbf51a4-2b93-4afb-9518-f2ea02ad0da4")
    public static final String ALARM_INSTANCE_ISWATCHDOG_TAGTYPE = "Alarm_Instance_isWatchdog";

    @objid ("62feded9-6e8a-4d0c-9535-1971e9014cc0")
    public static final String ALARM_INSTANCE_TIMERS_TAGTYPE = "Alarm_Instance_timers";

    /**
     * Tells whether a {@link AlarmInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << Alarm_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("68e7c2b4-85fa-4de5-a004-dfa4af3a41a0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, AlarmInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << Alarm_Instance >> then instantiate a {@link AlarmInstance} proxy.
     * 
     * @return a {@link AlarmInstance} proxy on the created {@link Instance}.
     */
    @objid ("2bd638f6-8eba-4257-a655-944b6a226e4f")
    public static AlarmInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, AlarmInstance.STEREOTYPE_NAME);
        return AlarmInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link AlarmInstance} proxy from a {@link Instance} stereotyped << Alarm_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link AlarmInstance} proxy or <i>null</i>.
     */
    @objid ("e26b0982-5d77-4ab3-b62b-3801548edf58")
    public static AlarmInstance instantiate(final Instance obj) {
        return AlarmInstance.canInstantiate(obj) ? new AlarmInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link AlarmInstance} proxy from a {@link Instance} stereotyped << Alarm_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link AlarmInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e655c508-51a6-467a-a3ea-e867afa4f89a")
    public static AlarmInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (AlarmInstance.canInstantiate(obj))
        	return new AlarmInstance(obj);
        else
        	throw new IllegalArgumentException("AlarmInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("300f7ea4-778a-4bf4-9d79-4c1e728335da")
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
        AlarmInstance other = (AlarmInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for List<String> property 'Alarm_Instance_timers'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b79cb2cf-f222-407b-9368-cb54f90b1872")
    public List<String> getAlarm_Instance_timers() {
        return this.elt.getTagValues(AlarmInstance.MdaTypes.ALARM_INSTANCE_TIMERS_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("08bfe48c-f8fa-4eaa-b27c-053234b8b483")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("c499196b-fda7-47c0-b990-5bb99be1e4f1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Alarm_Instance_isWatchdog'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("659478f9-f1d7-4db0-add8-fa2342c186e9")
    public boolean isAlarm_Instance_isWatchdog() {
        return this.elt.isTagged(AlarmInstance.MdaTypes.ALARM_INSTANCE_ISWATCHDOG_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Alarm_Instance_isWatchdog'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a9d9443e-9359-48d6-b1ff-4c6c497926d5")
    public void setAlarm_Instance_isWatchdog(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(AlarmInstance.MdaTypes.ALARM_INSTANCE_ISWATCHDOG_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(AlarmInstance.MdaTypes.ALARM_INSTANCE_ISWATCHDOG_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'Alarm_Instance_timers'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0052c64e-351a-4772-a6fd-227aa87f9153")
    public void setAlarm_Instance_timers(final List<String> values) {
        this.elt.putTagValues(AlarmInstance.MdaTypes.ALARM_INSTANCE_TIMERS_TAGTYPE_ELT, values);
    }

    @objid ("e294a2f7-6eac-47d7-bfdf-5b8f31a9deee")
    protected AlarmInstance(final Instance elt) {
        super(elt);
    }

    @objid ("41f7636f-fc6b-4ca0-b665-60896e8e23d1")
    public static final class MdaTypes {
        @objid ("7e30accd-05cd-455e-addf-be3a75dca4f6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1c5d0377-f972-46c7-91fd-e30b53427963")
        public static TagType ALARM_INSTANCE_ISWATCHDOG_TAGTYPE_ELT;

        @objid ("84a710af-39d8-4a1b-a614-cbcad6733143")
        public static TagType ALARM_INSTANCE_TIMERS_TAGTYPE_ELT;

        @objid ("8b19c5ad-dc72-43df-974a-e1ac61fcd124")
        private static Stereotype MDAASSOCDEP;

        @objid ("5a69bacb-8f3c-4543-a264-65c295ede4ce")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4f8f0816-1d6e-42d7-be50-1f4c05c4f68b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01f43545-0ccf-11df-8525-001302895b2b");
            ALARM_INSTANCE_ISWATCHDOG_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01f4354c-0ccf-11df-8525-001302895b2b");
            ALARM_INSTANCE_TIMERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01f43553-0ccf-11df-8525-001302895b2b");
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
