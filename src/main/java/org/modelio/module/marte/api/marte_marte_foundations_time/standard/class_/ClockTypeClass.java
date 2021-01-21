/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_time.standard.class_;

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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << ClockType_Class >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("ce9b4e43-dbbf-47d7-b2ed-654e00068e1f")
public class ClockTypeClass {
    @objid ("25118965-6909-4e86-b8e0-b3891a1555c7")
    public static final String STEREOTYPE_NAME = "ClockType_Class";

    @objid ("f630429e-e2c6-4d1f-8b85-0dadddb35d62")
    public static final String CLOCKTYPE_CLASS_GETTIME_TAGTYPE = "ClockType_Class_getTime";

    @objid ("df394d12-d1c3-42c0-ba63-ce1fe0c8cad4")
    public static final String CLOCKTYPE_CLASS_INDEXTOVALUE_TAGTYPE = "ClockType_Class_indexToValue";

    @objid ("bdab1974-0263-4294-afca-5feebc53af0a")
    public static final String CLOCKTYPE_CLASS_ISLOGICAL_TAGTYPE = "ClockType_Class_isLogical";

    @objid ("33ba1e2a-903c-4399-b3d8-db8385bedfcd")
    public static final String CLOCKTYPE_CLASS_MAXVALATTR_TAGTYPE = "ClockType_Class_maxValAttr";

    @objid ("503fb806-713a-4873-be5b-7deaf66d164e")
    public static final String CLOCKTYPE_CLASS_NATURE_TAGTYPE = "ClockType_Class_nature";

    @objid ("7a477ad0-47fb-415b-9cb2-255e3567ef8f")
    public static final String CLOCKTYPE_CLASS_OFFSETATTR_TAGTYPE = "ClockType_Class_offsetAttr";

    @objid ("19cdb614-6e1d-431c-beec-c80145dece10")
    public static final String CLOCKTYPE_CLASS_RESOLATTR_TAGTYPE = "ClockType_Class_resolAttr";

    @objid ("ce3f291d-6cec-4ccd-82d0-cba6dfe8d3ed")
    public static final String CLOCKTYPE_CLASS_SETTIME_TAGTYPE = "ClockType_Class_setTime";

    @objid ("32148cc2-79d8-4cc0-a2b6-b9195fdc643f")
    public static final String CLOCKTYPE_CLASS_UNITTYPE_TAGTYPE = "ClockType_Class_unitType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("739aa623-8a5b-4f45-bc33-45bbb07a7063")
    protected final Class elt;

    /**
     * Tells whether a {@link ClockTypeClass proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ClockType_Class >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("0e6292f6-8e1c-4939-9042-59aeb606bbe3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ClockTypeClass.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ClockType_Class >> then instantiate a {@link ClockTypeClass} proxy.
     * 
     * @return a {@link ClockTypeClass} proxy on the created {@link Class}.
     */
    @objid ("f5b67d3e-fe9d-4826-9bc7-5461147c58cb")
    public static ClockTypeClass create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Class");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ClockTypeClass.STEREOTYPE_NAME);
        return ClockTypeClass.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link ClockTypeClass} proxy from a {@link Class} stereotyped << ClockType_Class >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link ClockTypeClass} proxy or <i>null</i>.
     */
    @objid ("6c4f93c3-78d7-4ce8-9720-b3501e7ff4b3")
    public static ClockTypeClass instantiate(final Class obj) {
        return ClockTypeClass.canInstantiate(obj) ? new ClockTypeClass(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ClockTypeClass} proxy from a {@link Class} stereotyped << ClockType_Class >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link ClockTypeClass} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("30b3d16d-ba65-4aad-a663-0dee969e692d")
    public static ClockTypeClass safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ClockTypeClass.canInstantiate(obj))
        	return new ClockTypeClass(obj);
        else
        	throw new IllegalArgumentException("ClockTypeClass: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("978f068a-475d-4124-a171-bc3f0b13c0e4")
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
        ClockTypeClass other = (ClockTypeClass) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'ClockType_Class_getTime'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("93208c49-0a0f-49cf-a1bf-6d9dfcf8f32a")
    public String getClockType_Class_getTime() {
        return this.elt.getTagValue(ClockTypeClass.MdaTypes.CLOCKTYPE_CLASS_GETTIME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'ClockType_Class_indexToValue'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("21ef1c7d-beea-4c3b-9ef7-e24463707017")
    public String getClockType_Class_indexToValue() {
        return this.elt.getTagValue(ClockTypeClass.MdaTypes.CLOCKTYPE_CLASS_INDEXTOVALUE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'ClockType_Class_maxValAttr'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a9593832-f430-4baf-bf3f-ff5098240d81")
    public String getClockType_Class_maxValAttr() {
        return this.elt.getTagValue(ClockTypeClass.MdaTypes.CLOCKTYPE_CLASS_MAXVALATTR_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'ClockType_Class_nature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8ef33c05-9c96-483c-b46c-e020a08556ed")
    public String getClockType_Class_nature() {
        return this.elt.getTagValue(ClockTypeClass.MdaTypes.CLOCKTYPE_CLASS_NATURE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'ClockType_Class_offsetAttr'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e8fc7d56-0bb7-4bbe-8eb6-b3491405ed78")
    public String getClockType_Class_offsetAttr() {
        return this.elt.getTagValue(ClockTypeClass.MdaTypes.CLOCKTYPE_CLASS_OFFSETATTR_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'ClockType_Class_resolAttr'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e3ddbbaa-98cb-4f16-82e3-64586a065416")
    public String getClockType_Class_resolAttr() {
        return this.elt.getTagValue(ClockTypeClass.MdaTypes.CLOCKTYPE_CLASS_RESOLATTR_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'ClockType_Class_setTime'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ff742d44-204d-4ba3-b5e4-ebb2e940ca32")
    public String getClockType_Class_setTime() {
        return this.elt.getTagValue(ClockTypeClass.MdaTypes.CLOCKTYPE_CLASS_SETTIME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'ClockType_Class_unitType'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("00e4117e-56bf-44ad-9d33-4918e4a3f252")
    public String getClockType_Class_unitType() {
        return this.elt.getTagValue(ClockTypeClass.MdaTypes.CLOCKTYPE_CLASS_UNITTYPE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("f31d41e6-369e-45d6-8fde-7cface131018")
    public Class getElement() {
        return this.elt;
    }

    @objid ("2df11c11-84b2-4c55-89a0-87fd2c73ded6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'ClockType_Class_isLogical'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4505788e-eb6c-4e0d-838b-3c0e6dd3e228")
    public boolean isClockType_Class_isLogical() {
        return this.elt.isTagged(ClockTypeClass.MdaTypes.CLOCKTYPE_CLASS_ISLOGICAL_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'ClockType_Class_getTime'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("02953eab-2ae0-4166-8f05-efb64eafb0e7")
    public void setClockType_Class_getTime(final String value) {
        this.elt.putTagValue(ClockTypeClass.MdaTypes.CLOCKTYPE_CLASS_GETTIME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'ClockType_Class_indexToValue'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("16ac3639-6078-41da-9886-ac58a7392e7f")
    public void setClockType_Class_indexToValue(final String value) {
        this.elt.putTagValue(ClockTypeClass.MdaTypes.CLOCKTYPE_CLASS_INDEXTOVALUE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'ClockType_Class_isLogical'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f386bb0e-6c25-4e7c-af5f-86e0eaa00fd3")
    public void setClockType_Class_isLogical(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(ClockTypeClass.MdaTypes.CLOCKTYPE_CLASS_ISLOGICAL_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(ClockTypeClass.MdaTypes.CLOCKTYPE_CLASS_ISLOGICAL_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'ClockType_Class_maxValAttr'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b29bad8a-5aae-4482-a562-8df49aca4e55")
    public void setClockType_Class_maxValAttr(final String value) {
        this.elt.putTagValue(ClockTypeClass.MdaTypes.CLOCKTYPE_CLASS_MAXVALATTR_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'ClockType_Class_nature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0a8ee4b5-9e2a-4a50-a9c1-2676dc0b6155")
    public void setClockType_Class_nature(final String value) {
        this.elt.putTagValue(ClockTypeClass.MdaTypes.CLOCKTYPE_CLASS_NATURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'ClockType_Class_offsetAttr'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6f328af7-d8b4-4168-af2d-9b890ad2086c")
    public void setClockType_Class_offsetAttr(final String value) {
        this.elt.putTagValue(ClockTypeClass.MdaTypes.CLOCKTYPE_CLASS_OFFSETATTR_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'ClockType_Class_resolAttr'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c1885053-e7d7-4471-97a7-29f09daab8c3")
    public void setClockType_Class_resolAttr(final String value) {
        this.elt.putTagValue(ClockTypeClass.MdaTypes.CLOCKTYPE_CLASS_RESOLATTR_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'ClockType_Class_setTime'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2fcac524-621a-4c8c-9e84-715424beb8e0")
    public void setClockType_Class_setTime(final String value) {
        this.elt.putTagValue(ClockTypeClass.MdaTypes.CLOCKTYPE_CLASS_SETTIME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'ClockType_Class_unitType'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d726b1b8-7d09-49ff-b3ab-51424641d296")
    public void setClockType_Class_unitType(final String value) {
        this.elt.putTagValue(ClockTypeClass.MdaTypes.CLOCKTYPE_CLASS_UNITTYPE_TAGTYPE_ELT, value);
    }

    @objid ("69d1fc3e-6adb-4303-9027-65be97d090e7")
    protected ClockTypeClass(final Class elt) {
        this.elt = elt;
    }

    @objid ("916d5c81-c908-4eb6-8e36-4f96c43f398c")
    public static final class MdaTypes {
        @objid ("6001ee49-d916-449b-a43f-e248ed947158")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c8615200-ac90-4d4e-9884-eb71511a4f17")
        public static TagType CLOCKTYPE_CLASS_NATURE_TAGTYPE_ELT;

        @objid ("334c206c-cc72-4d99-9bae-165f52678fed")
        public static TagType CLOCKTYPE_CLASS_UNITTYPE_TAGTYPE_ELT;

        @objid ("19bf2fdd-b3c3-4b01-ab39-9da1fb8749d3")
        public static TagType CLOCKTYPE_CLASS_ISLOGICAL_TAGTYPE_ELT;

        @objid ("683e0c9e-99f6-485b-8e5f-7ef85111b3f2")
        public static TagType CLOCKTYPE_CLASS_RESOLATTR_TAGTYPE_ELT;

        @objid ("4a1cb456-dae9-49fd-912c-0f9a02d652e8")
        public static TagType CLOCKTYPE_CLASS_MAXVALATTR_TAGTYPE_ELT;

        @objid ("66ced455-6906-4f3e-b6f2-e2cccfd4d6e9")
        public static TagType CLOCKTYPE_CLASS_OFFSETATTR_TAGTYPE_ELT;

        @objid ("3ab00bda-fd39-49c0-9bb0-ca2b76f8e5b5")
        public static TagType CLOCKTYPE_CLASS_GETTIME_TAGTYPE_ELT;

        @objid ("e2707174-7c9d-4ea7-b4d2-2da3ec7b5d30")
        public static TagType CLOCKTYPE_CLASS_SETTIME_TAGTYPE_ELT;

        @objid ("b47d1b6d-04a0-4343-ac21-624cb207bc8b")
        public static TagType CLOCKTYPE_CLASS_INDEXTOVALUE_TAGTYPE_ELT;

        @objid ("63510a68-c120-45cb-b59b-35543fb0cb65")
        private static Stereotype MDAASSOCDEP;

        @objid ("efb488c6-91d4-4558-9a11-6c45a207a34c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("72bb2d2a-0a44-4bed-86dc-aa2c9d8eaeac")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "dae571f0-0cce-11df-8525-001302895b2b");
            CLOCKTYPE_CLASS_NATURE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dae571f6-0cce-11df-8525-001302895b2b");
            CLOCKTYPE_CLASS_UNITTYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dae571fc-0cce-11df-8525-001302895b2b");
            CLOCKTYPE_CLASS_ISLOGICAL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dae57202-0cce-11df-8525-001302895b2b");
            CLOCKTYPE_CLASS_RESOLATTR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dae7d42f-0cce-11df-8525-001302895b2b");
            CLOCKTYPE_CLASS_MAXVALATTR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dae7d435-0cce-11df-8525-001302895b2b");
            CLOCKTYPE_CLASS_OFFSETATTR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dae7d43b-0cce-11df-8525-001302895b2b");
            CLOCKTYPE_CLASS_GETTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dae7d441-0cce-11df-8525-001302895b2b");
            CLOCKTYPE_CLASS_SETTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dae7d447-0cce-11df-8525-001302895b2b");
            CLOCKTYPE_CLASS_INDEXTOVALUE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dae7d44d-0cce-11df-8525-001302895b2b");
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
